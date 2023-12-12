--
-- PostgreSQL database dump
--

-- Dumped from database version 16.1
-- Dumped by pg_dump version 16.1

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

DROP DATABASE IF EXISTS car_assembly;
--
-- Name: car_assembly; Type: DATABASE; Schema: -; Owner: postgres
--

CREATE DATABASE car_assembly WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'Russian_Russia.1251';


ALTER DATABASE car_assembly OWNER TO postgres;

\connect car_assembly

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- Name: car_assembly; Type: SCHEMA; Schema: -; Owner: postgres
--

CREATE SCHEMA car_assembly;


ALTER SCHEMA car_assembly OWNER TO postgres;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: car; Type: TABLE; Schema: car_assembly; Owner: postgres
--

CREATE TABLE car_assembly.car (
    uuid character varying(255),
    car_body_id bigint,
    wheel_size_id bigint,
    wheels_count integer,
    name character varying(255)
);


ALTER TABLE car_assembly.car OWNER TO postgres;

--
-- Name: car_body; Type: TABLE; Schema: car_assembly; Owner: postgres
--

CREATE TABLE car_assembly.car_body (
    id bigint,
    type character varying(255)
);


ALTER TABLE car_assembly.car_body OWNER TO postgres;

--
-- Name: wheel; Type: TABLE; Schema: car_assembly; Owner: postgres
--

CREATE TABLE car_assembly.wheel (
    id bigint,
    size character varying(255)
);


ALTER TABLE car_assembly.wheel OWNER TO postgres;

--
-- Data for Name: car; Type: TABLE DATA; Schema: car_assembly; Owner: postgres
--

INSERT INTO car_assembly.car (uuid, car_body_id, wheel_size_id, wheels_count, name) VALUES ('421676dc-5596-4132-ba39-5e8dfff48217', 1, 2, 4, 'BMW M5');
INSERT INTO car_assembly.car (uuid, car_body_id, wheel_size_id, wheels_count, name) VALUES ('07e18100-e565-440c-8263-b7d820c809ff', 2, 2, 4, 'BMW M3');
INSERT INTO car_assembly.car (uuid, car_body_id, wheel_size_id, wheels_count, name) VALUES ('5f52e822-9bf6-48ec-b96a-e8d0f42e5aeb', 2, 2, 4, 'BMW M4');
INSERT INTO car_assembly.car (uuid, car_body_id, wheel_size_id, wheels_count, name) VALUES ('ddc39b06-d389-4f4a-9632-7ff025f91512', 2, 2, 4, 'BMW M4');
INSERT INTO car_assembly.car (uuid, car_body_id, wheel_size_id, wheels_count, name) VALUES ('44782beb-95a9-42a9-83c9-0ab649a82487', 2, 2, 4, 'BMW M4');
INSERT INTO car_assembly.car (uuid, car_body_id, wheel_size_id, wheels_count, name) VALUES ('ad0abba9-05db-4dc9-a806-78f70ca1ce45', 2, 2, 4, 'BMW M4');
INSERT INTO car_assembly.car (uuid, car_body_id, wheel_size_id, wheels_count, name) VALUES ('44812468-9749-47d0-82a5-e54de0dea2af', 2, 2, 4, 'BMW M4');
INSERT INTO car_assembly.car (uuid, car_body_id, wheel_size_id, wheels_count, name) VALUES ('7267e8de-9eb0-4f2f-84ae-ca54e04d1b38', 2, 2, 4, 'BMW M4');
INSERT INTO car_assembly.car (uuid, car_body_id, wheel_size_id, wheels_count, name) VALUES ('8020d55a-3378-471e-b6c6-177f4f983822', 2, 2, 4, 'BMW M4');
INSERT INTO car_assembly.car (uuid, car_body_id, wheel_size_id, wheels_count, name) VALUES ('0b895dbf-994f-4e60-8ac2-064ff4202247', 2, 2, 4, 'BMW M4');
INSERT INTO car_assembly.car (uuid, car_body_id, wheel_size_id, wheels_count, name) VALUES ('f63f3187-c74a-436b-befc-520ea98021f1', 2, 2, 4, 'BMW M4');
INSERT INTO car_assembly.car (uuid, car_body_id, wheel_size_id, wheels_count, name) VALUES ('cc8bbcac-2afc-413c-b10d-08dddf7f93e4', 2, 2, 4, 'BMW M4');
INSERT INTO car_assembly.car (uuid, car_body_id, wheel_size_id, wheels_count, name) VALUES ('5b085300-ec63-4b17-aae6-00dcc2d51acd', 2, 2, 4, 'BMW M4');
INSERT INTO car_assembly.car (uuid, car_body_id, wheel_size_id, wheels_count, name) VALUES ('4871c7ba-5fa6-42ef-a0d2-b4a1f897bf96', 2, 2, 4, 'BMW M4');
INSERT INTO car_assembly.car (uuid, car_body_id, wheel_size_id, wheels_count, name) VALUES ('0bcc869f-81d8-4be1-85a7-78c17ebc14c7', 1, 2, 4, 'LADA 2109');


--
-- Data for Name: car_body; Type: TABLE DATA; Schema: car_assembly; Owner: postgres
--

INSERT INTO car_assembly.car_body (id, type) VALUES (1, 'Sedan');
INSERT INTO car_assembly.car_body (id, type) VALUES (2, 'Coupe');
INSERT INTO car_assembly.car_body (id, type) VALUES (3, 'Hatchback');
INSERT INTO car_assembly.car_body (id, type) VALUES (4, 'Crossover');


--
-- Data for Name: wheel; Type: TABLE DATA; Schema: car_assembly; Owner: postgres
--

INSERT INTO car_assembly.wheel (id, size) VALUES (1, 'R15');
INSERT INTO car_assembly.wheel (id, size) VALUES (2, 'R16');
INSERT INTO car_assembly.wheel (id, size) VALUES (3, 'R17');


--
-- PostgreSQL database dump complete
--

