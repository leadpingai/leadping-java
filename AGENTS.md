# AGENTS.md

This file is the operating guide for coding agents working in the public Leadping Java SDK repository. Follow it together with `CONTRIBUTING.md`, `SECURITY.md`, and the Maven configuration.

## Repository purpose

This repository contains the official Java client for the Leadping API. Microsoft Kiota generates the client from Leadping’s OpenAPI contract. Applications supply authentication, credential storage, transport configuration, retry behavior, and logging policy.

Authoritative public resources:

- API contract: <https://leadping.ai/docs/openapi.json>
- API documentation: <https://leadping.ai/docs/api-reference>
- Authentication discovery: <https://leadping.ai/auth.md>
- Security reporting: `SECURITY.md`

## Understand the change before editing

Endpoint and schema changes belong in the upstream API/OpenAPI contract. Request builders, models, serializers, parsers, and `LeadpingOpenApiClient.java` are generated and should be regenerated from that contract. Documentation, examples, Maven metadata, workflows, and contributor files are maintained here.

If valid OpenAPI produces invalid Java, treat that as a generator issue. Keep any necessary workaround small, documented, and easy to remove. Avoid unrelated regeneration, formatting, or dependency upgrades, and review generated diffs for source and binary compatibility.

## Java conventions

- Use the Java release configured in `pom.xml`.
- Preserve package names, nullability annotations, Kiota interfaces, async return types, serialization behavior, and error mappings.
- Do not add a second HTTP or object-mapping stack around generated request builders.
- Treat public classes, methods, packages, and Maven coordinates as compatibility-sensitive.
- Do not edit `.flattened-pom.xml`; it is release-generated output.

## Authentication and examples

Send Leadping credentials as `Authorization: Bearer <credential>`. Never commit or log real user tokens, WorkOS agent assertions or refresh tokens, organization API keys, or source keys. Examples should use nonfunctional values, obtain secrets outside source control, and not imply that the SDK stores or refreshes credentials.

## Validation

For Java, dependency, or Maven metadata changes, run:

```bash
mvn --batch-mode test
```

Use `mvn --batch-mode verify` when package lifecycle or publishing configuration changes. Documentation-only work normally needs link, spelling, and example review rather than a complete Maven lifecycle.

Before handing off, inspect the full diff, explain any OpenAPI or Kiota version change, update documentation when usage changes, and report checks run and checks omitted.

## Releases and security

Do not change `${revision}`, flatten or sign the POM, create tags, alter publishing configuration, or deploy artifacts unless explicitly authorized. Follow `SECURITY.md` for private vulnerability reporting.
