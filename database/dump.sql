--
-- PostgreSQL database dump
--

-- Dumped from database version 15.2
-- Dumped by pg_dump version 15.2

-- Started on 2023-02-22 12:40:30

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
-- TOC entry 3320 (class 1262 OID 16398)
-- Name: first_db; Type: DATABASE; Schema: -; Owner: postgres
--

CREATE DATABASE first_db WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'Ukrainian_Ukraine.1251';


ALTER DATABASE first_db OWNER TO postgres;

\connect first_db

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

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 214 (class 1259 OID 16399)
-- Name: person; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.person (
    id integer,
    name character varying,
    age integer,
    email character varying
);


ALTER TABLE public.person OWNER TO postgres;

--
-- TOC entry 3314 (class 0 OID 16399)
-- Dependencies: 214
-- Data for Name: person; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.person (id, name, age, email) VALUES (1, 'Tom', 18, 'tom@email.com');
INSERT INTO public.person (id, name, age, email) VALUES (2, 'Bob', 34, 'bob@email.com');
INSERT INTO public.person (id, name, age, email) VALUES (3, 'Kate', 24, 'kate@email.com');
INSERT INTO public.person (id, name, age, email) VALUES (4, 'Mike', 36, 'mike@email.com');
INSERT INTO public.person (id, name, age, email) VALUES (1, 'Bobbby', 23, 'bobby@email.com');


-- Completed on 2023-02-22 12:40:30

--
-- PostgreSQL database dump complete
--

