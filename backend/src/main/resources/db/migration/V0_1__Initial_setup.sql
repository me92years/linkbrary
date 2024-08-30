CREATE TABLE "folders" (
	"id" BIGINT NOT NULL,
	"created_at" TIMESTAMP NULL DEFAULT NULL,
	"last_modified_at" TIMESTAMP NULL DEFAULT NULL,
	"link_count" INTEGER NOT NULL,
	"name" VARCHAR(255) NOT NULL,
	PRIMARY KEY ("id"),
	UNIQUE INDEX "uk_folder_name" ("name")
);

CREATE TABLE "users" (
	"id" BIGINT NOT NULL,
	"email" VARCHAR(255) NOT NULL,
	"password" VARCHAR(255) NOT NULL,
	"profile_picture" VARCHAR(255) NULL DEFAULT NULL,
	"username" VARCHAR(255) NOT NULL,
	"created_at" TIMESTAMP NULL DEFAULT NULL,
	"last_modified_at" TIMESTAMP NULL DEFAULT NULL,
	PRIMARY KEY ("id"),
	UNIQUE INDEX "uk_user_email" ("email"),
	UNIQUE INDEX "uk_user_username" ("username")
)
;
