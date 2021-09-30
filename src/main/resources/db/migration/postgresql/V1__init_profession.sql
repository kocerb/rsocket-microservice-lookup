CREATE TABLE profession
(
    id               uuid                   NOT NULL DEFAULT uuid_generate_v4(),
    name             character varying(255) NOT NULL,
    version          bigint                 NOT NULL DEFAULT 0,
    created_at       timestamp without time zone NOT NULL DEFAULT now(),
    created_by       uuid,
    last_modified_at timestamp without time zone NOT NULL DEFAULT now(),
    last_modified_by uuid
);

ALTER TABLE ONLY profession
    ADD CONSTRAINT profession_pkey PRIMARY KEY (id);

INSERT INTO profession (id, name)
VALUES ('24d48b7a-f4fd-4f45-a3c1-b09545ae6b5f', 'Accountant'),
       ('73483945-81c1-4b64-a461-5344c8fbaf4e', 'Actor'),
       ('224a8f35-eb70-4c4e-a720-f17f79bf17cc', 'Actress'),
       ('f7bacfff-c652-4c73-9fa1-b1086a633233', 'Air Traffic Controller'),
       ('f8cdd249-615f-4598-b77e-c41de9fc47d3', 'Architect'),
       ('962513ab-3def-4272-b427-45eb8639bb2e', 'Artist'),
       ('d8144735-df2b-4efe-a227-2829cba5716d', 'Attorney'),
       ('5771f678-753f-4876-8137-28ed47419346', 'Banker'),
       ('a05ca29c-943c-468b-826b-7894307dee63', 'Bartender'),
       ('10296519-31be-4fdc-a2ab-de998fef6c73', 'Barber'),
       ('0a64e529-d205-497f-a9ab-9d46891bfffd', 'Bookkeeper'),
       ('5cba29fa-4c5e-4241-ae2b-8e165784ef99', 'Builder'),
       ('5ac5e4bd-a926-4bae-ac35-a8acfeae5d7d', 'Businessman'),
       ('59737ef2-53b0-491d-890c-4c0bb064b8de', 'Businesswoman'),
       ('d1607ee5-7789-4ef4-b21a-31d429c2be6c', 'Businessperson'),
       ('f89ef4d7-1341-4c1a-b579-45e497d49143', 'Butcher'),
       ('b1896292-2f0b-4351-a9ec-73daeb621a5e', 'Carpenter'),
       ('2bf3f2cb-8b6d-4fd1-96a0-4d800da6d655', 'Cashier'),
       ('887c50d0-9084-47e8-a178-7ba6f44339f3', 'Chef'),
       ('077be7a2-eb30-43c0-a2c1-7d81d6a79261', 'Coach'),
       ('1f7c018e-299f-4b74-a2bc-db3fa15094b3', 'Dental Hygienist'),
       ('ff4b9721-eac5-405b-a456-c2f5df8d5c1c', 'Dentist'),
       ('cc993c59-ebf1-4e01-b022-d7a2f98af8fb', 'Designer'),
       ('84f59384-4b84-4378-8de8-b2a62ace5051', 'Developer'),
       ('14098f8e-5991-4ac7-bf74-7f5928b35056', 'Dietician'),
       ('649b644d-9f33-4655-84e0-d9e35a4123a3', 'Doctor'),
       ('b6c86185-9de2-4af8-86fd-dd58911caa76', 'Economist'),
       ('1d893fd3-88fe-427b-a582-19ccc9bd0051', 'Editor'),
       ('3e42474c-e6d6-4fcc-8719-6982c5426358', 'Electrician'),
       ('683aa427-bc20-47c2-878b-4349473119f9', 'Engineer');