FROM gradle:3.4-jdk8-alpine

WORKDIR /workspace
COPY . /workspace

RUN gradle generateTablesJooqSchemaSourc