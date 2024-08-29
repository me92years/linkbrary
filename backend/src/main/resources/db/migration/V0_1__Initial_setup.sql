CREATE TABLE "folders" (
	"id" BIGINT NOT NULL,
	"created_at" TIMESTAMP NULL DEFAULT NULL,
	"last_modified_at" TIMESTAMP NULL DEFAULT NULL,
	"link_count" INTEGER NOT NULL,
	"name" VARCHAR(255) NOT NULL,
	PRIMARY KEY ("id"),
	UNIQUE INDEX "uknw9k8xkn6u5cgguq7q8bt3m1d" ("name")
)