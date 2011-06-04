--
-- PostgreSQL database dump
--

-- Dumped from database version 9.0.3
-- Dumped by pg_dump version 9.0.3
-- Started on 2011-06-04 19:02:44

SET statement_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = off;
SET check_function_bodies = false;
SET client_min_messages = warning;
SET escape_string_warning = off;

--
-- TOC entry 336 (class 2612 OID 11574)
-- Name: plpgsql; Type: PROCEDURAL LANGUAGE; Schema: -; Owner: postgres
--

CREATE OR REPLACE PROCEDURAL LANGUAGE plpgsql;


ALTER PROCEDURAL LANGUAGE plpgsql OWNER TO postgres;

SET search_path = public, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 1539 (class 1259 OID 16768)
-- Dependencies: 5
-- Name: faktura; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE faktura (
    id integer NOT NULL,
    nr character varying(10) NOT NULL,
    data_wystawienie date NOT NULL,
    data_sprzedazy date NOT NULL,
    kontrahent integer,
    termin_platnosci date NOT NULL,
    wartosc_netto numeric,
    wartosc_vat numeric,
    wartosc_brutto numeric,
    forma_platnosci character varying(20)
);


ALTER TABLE public.faktura OWNER TO postgres;

--
-- TOC entry 1538 (class 1259 OID 16766)
-- Dependencies: 5 1539
-- Name: faktura_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE faktura_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.faktura_id_seq OWNER TO postgres;

--
-- TOC entry 1871 (class 0 OID 0)
-- Dependencies: 1538
-- Name: faktura_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE faktura_id_seq OWNED BY faktura.id;


--
-- TOC entry 1872 (class 0 OID 0)
-- Dependencies: 1538
-- Name: faktura_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('faktura_id_seq', 19, true);


--
-- TOC entry 1533 (class 1259 OID 16697)
-- Dependencies: 5
-- Name: forma_platnosci; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE forma_platnosci (
    id integer NOT NULL,
    opis character varying(20) NOT NULL,
    ilosc_dni integer
);


ALTER TABLE public.forma_platnosci OWNER TO postgres;

--
-- TOC entry 1532 (class 1259 OID 16695)
-- Dependencies: 1533 5
-- Name: forma_platnosci_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE forma_platnosci_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.forma_platnosci_id_seq OWNER TO postgres;

--
-- TOC entry 1873 (class 0 OID 0)
-- Dependencies: 1532
-- Name: forma_platnosci_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE forma_platnosci_id_seq OWNED BY forma_platnosci.id;


--
-- TOC entry 1874 (class 0 OID 0)
-- Dependencies: 1532
-- Name: forma_platnosci_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('forma_platnosci_id_seq', 8, true);


--
-- TOC entry 1531 (class 1259 OID 16689)
-- Dependencies: 5
-- Name: jednostka; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE jednostka (
    id integer NOT NULL,
    jednostka_m character varying(10) NOT NULL
);


ALTER TABLE public.jednostka OWNER TO postgres;

--
-- TOC entry 1530 (class 1259 OID 16687)
-- Dependencies: 5 1531
-- Name: jednostka_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE jednostka_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.jednostka_id_seq OWNER TO postgres;

--
-- TOC entry 1875 (class 0 OID 0)
-- Dependencies: 1530
-- Name: jednostka_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE jednostka_id_seq OWNED BY jednostka.id;


--
-- TOC entry 1876 (class 0 OID 0)
-- Dependencies: 1530
-- Name: jednostka_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('jednostka_id_seq', 6, true);


--
-- TOC entry 1529 (class 1259 OID 16667)
-- Dependencies: 5
-- Name: kontrahent; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE kontrahent (
    id integer NOT NULL,
    skrot character varying(20) NOT NULL,
    nazwa character varying(50) NOT NULL,
    ulica character varying(40) NOT NULL,
    kod character varying(6) NOT NULL,
    miasto character varying(20) NOT NULL,
    nip character varying(10) NOT NULL,
    konto character varying(26),
    osoba character varying(20),
    tel character varying(20),
    email character varying(20)
);


ALTER TABLE public.kontrahent OWNER TO postgres;

--
-- TOC entry 1528 (class 1259 OID 16665)
-- Dependencies: 5 1529
-- Name: kontrahent_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE kontrahent_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.kontrahent_id_seq OWNER TO postgres;

--
-- TOC entry 1877 (class 0 OID 0)
-- Dependencies: 1528
-- Name: kontrahent_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE kontrahent_id_seq OWNED BY kontrahent.id;


--
-- TOC entry 1878 (class 0 OID 0)
-- Dependencies: 1528
-- Name: kontrahent_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('kontrahent_id_seq', 43, true);


--
-- TOC entry 1541 (class 1259 OID 16791)
-- Dependencies: 1831 1832 5
-- Name: pozycja; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pozycja (
    id integer NOT NULL,
    nazwa character varying(50) NOT NULL,
    pkwiu character varying(20),
    jednm character varying(10),
    cena_netto numeric NOT NULL,
    vat numeric,
    cena_brutto numeric NOT NULL,
    ilosc numeric NOT NULL,
    wartosc_netto numeric,
    wartosc_brutto numeric,
    faktura integer,
    vat_opis character varying(10),
    CONSTRAINT pozycja_cena_netto_check CHECK ((cena_netto > (0)::numeric)),
    CONSTRAINT pozycja_ilosc_check CHECK ((ilosc > (0)::numeric))
);


ALTER TABLE public.pozycja OWNER TO postgres;

--
-- TOC entry 1540 (class 1259 OID 16789)
-- Dependencies: 1541 5
-- Name: pozycja_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE pozycja_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.pozycja_id_seq OWNER TO postgres;

--
-- TOC entry 1879 (class 0 OID 0)
-- Dependencies: 1540
-- Name: pozycja_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE pozycja_id_seq OWNED BY pozycja.id;


--
-- TOC entry 1880 (class 0 OID 0)
-- Dependencies: 1540
-- Name: pozycja_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('pozycja_id_seq', 50, true);


--
-- TOC entry 1535 (class 1259 OID 16705)
-- Dependencies: 5
-- Name: rabat; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE rabat (
    id integer NOT NULL,
    wartosc_zakupow integer NOT NULL,
    wysokosc_rabatu integer NOT NULL
);


ALTER TABLE public.rabat OWNER TO postgres;

--
-- TOC entry 1534 (class 1259 OID 16703)
-- Dependencies: 1535 5
-- Name: rabat_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE rabat_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.rabat_id_seq OWNER TO postgres;

--
-- TOC entry 1881 (class 0 OID 0)
-- Dependencies: 1534
-- Name: rabat_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE rabat_id_seq OWNED BY rabat.id;


--
-- TOC entry 1882 (class 0 OID 0)
-- Dependencies: 1534
-- Name: rabat_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('rabat_id_seq', 1, false);


--
-- TOC entry 1545 (class 1259 OID 16825)
-- Dependencies: 5
-- Name: stawkavat; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE stawkavat (
    id integer NOT NULL,
    stawkavat character varying(10) NOT NULL,
    wartoscvat integer
);


ALTER TABLE public.stawkavat OWNER TO postgres;

--
-- TOC entry 1544 (class 1259 OID 16823)
-- Dependencies: 5 1545
-- Name: stawkavat_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE stawkavat_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.stawkavat_id_seq OWNER TO postgres;

--
-- TOC entry 1883 (class 0 OID 0)
-- Dependencies: 1544
-- Name: stawkavat_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE stawkavat_id_seq OWNED BY stawkavat.id;


--
-- TOC entry 1884 (class 0 OID 0)
-- Dependencies: 1544
-- Name: stawkavat_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('stawkavat_id_seq', 6, true);


--
-- TOC entry 1537 (class 1259 OID 16713)
-- Dependencies: 1828 5
-- Name: towar; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE towar (
    id integer NOT NULL,
    skrot character varying(20) NOT NULL,
    nazwa character varying(50) NOT NULL,
    pkwiu character varying(20),
    jednm integer,
    cena_netto numeric NOT NULL,
    vat integer,
    cena_brutto numeric NOT NULL,
    CONSTRAINT towar_cena_netto_check CHECK ((cena_netto > (0)::numeric))
);


ALTER TABLE public.towar OWNER TO postgres;

--
-- TOC entry 1536 (class 1259 OID 16711)
-- Dependencies: 1537 5
-- Name: towar_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE towar_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.towar_id_seq OWNER TO postgres;

--
-- TOC entry 1885 (class 0 OID 0)
-- Dependencies: 1536
-- Name: towar_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE towar_id_seq OWNED BY towar.id;


--
-- TOC entry 1886 (class 0 OID 0)
-- Dependencies: 1536
-- Name: towar_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('towar_id_seq', 7, true);


--
-- TOC entry 1543 (class 1259 OID 16809)
-- Dependencies: 5
-- Name: wplata; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE wplata (
    id integer NOT NULL,
    datawplaty date,
    kwota numeric,
    faktura integer
);


ALTER TABLE public.wplata OWNER TO postgres;

--
-- TOC entry 1542 (class 1259 OID 16807)
-- Dependencies: 1543 5
-- Name: wplata_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE wplata_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.wplata_id_seq OWNER TO postgres;

--
-- TOC entry 1887 (class 0 OID 0)
-- Dependencies: 1542
-- Name: wplata_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE wplata_id_seq OWNED BY wplata.id;


--
-- TOC entry 1888 (class 0 OID 0)
-- Dependencies: 1542
-- Name: wplata_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('wplata_id_seq', 1, false);


--
-- TOC entry 1829 (class 2604 OID 16771)
-- Dependencies: 1539 1538 1539
-- Name: id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE faktura ALTER COLUMN id SET DEFAULT nextval('faktura_id_seq'::regclass);


--
-- TOC entry 1825 (class 2604 OID 16700)
-- Dependencies: 1532 1533 1533
-- Name: id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE forma_platnosci ALTER COLUMN id SET DEFAULT nextval('forma_platnosci_id_seq'::regclass);


--
-- TOC entry 1824 (class 2604 OID 16692)
-- Dependencies: 1531 1530 1531
-- Name: id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE jednostka ALTER COLUMN id SET DEFAULT nextval('jednostka_id_seq'::regclass);


--
-- TOC entry 1823 (class 2604 OID 16670)
-- Dependencies: 1529 1528 1529
-- Name: id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE kontrahent ALTER COLUMN id SET DEFAULT nextval('kontrahent_id_seq'::regclass);


--
-- TOC entry 1830 (class 2604 OID 16794)
-- Dependencies: 1541 1540 1541
-- Name: id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE pozycja ALTER COLUMN id SET DEFAULT nextval('pozycja_id_seq'::regclass);


--
-- TOC entry 1826 (class 2604 OID 16708)
-- Dependencies: 1535 1534 1535
-- Name: id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE rabat ALTER COLUMN id SET DEFAULT nextval('rabat_id_seq'::regclass);


--
-- TOC entry 1834 (class 2604 OID 16828)
-- Dependencies: 1545 1544 1545
-- Name: id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE stawkavat ALTER COLUMN id SET DEFAULT nextval('stawkavat_id_seq'::regclass);


--
-- TOC entry 1827 (class 2604 OID 16716)
-- Dependencies: 1536 1537 1537
-- Name: id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE towar ALTER COLUMN id SET DEFAULT nextval('towar_id_seq'::regclass);


--
-- TOC entry 1833 (class 2604 OID 16812)
-- Dependencies: 1543 1542 1543
-- Name: id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE wplata ALTER COLUMN id SET DEFAULT nextval('wplata_id_seq'::regclass);


--
-- TOC entry 1862 (class 0 OID 16768)
-- Dependencies: 1539
-- Data for Name: faktura; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY faktura (id, nr, data_wystawienie, data_sprzedazy, kontrahent, termin_platnosci, wartosc_netto, wartosc_vat, wartosc_brutto, forma_platnosci) FROM stdin;
17	1/2011	2011-06-02	2011-06-02	43	2011-06-09	15300.0	3519.0	18819.0	przelew 7 dni
18	2/2011	2011-06-03	2011-06-03	2	2011-06-17	29500.0	6785.0	36285.0	przelew 14 dni
19	3/2011	2011-06-04	2011-06-04	43	2011-06-25	50125.0	11528.75	61653.75	przelew 21 dni
\.


--
-- TOC entry 1859 (class 0 OID 16697)
-- Dependencies: 1533
-- Data for Name: forma_platnosci; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY forma_platnosci (id, opis, ilosc_dni) FROM stdin;
4	przelew 7 dni	7
5	przelew 14 dni	14
6	gotówka	0
7	przelew 21 dni	21
8	karta kredytowa	0
\.


--
-- TOC entry 1858 (class 0 OID 16689)
-- Dependencies: 1531
-- Data for Name: jednostka; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY jednostka (id, jednostka_m) FROM stdin;
1	kg
3	l
4	m.k.
5	szt
\.


--
-- TOC entry 1857 (class 0 OID 16667)
-- Dependencies: 1529
-- Data for Name: kontrahent; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY kontrahent (id, skrot, nazwa, ulica, kod, miasto, nip, konto, osoba, tel, email) FROM stdin;
2	jaku	"Jakubex" Sp z o.o.	Gdanska 33	83-100	Tczew	593	656755765	Jak Wsz	536-27-17	j@wp.pl
43	comarch	Comarch	al. Jana Pawła II 41d	31-864	Kraków	6785432432		Jan Kowalski	12 684 80 00	
\.


--
-- TOC entry 1863 (class 0 OID 16791)
-- Dependencies: 1541
-- Data for Name: pozycja; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY pozycja (id, nazwa, pkwiu, jednm, cena_netto, vat, cena_brutto, ilosc, wartosc_netto, wartosc_brutto, faktura, vat_opis) FROM stdin;
45	Fiji FinePix HS10	23.23.45	5	930.0	2139.0	1143.9	10.0	9300.0	11439.0	17	23
46	HP ProBook 4320s		5	2000.0	1380.0	2460.0	3.0	6000.0	7380.0	17	23
47	Ramka Foto KODAK W1030		5	500.0	6325.0	615.0	55.0	27500.0	33825.0	18	23
48	HP ProBook 4320s		5	2000.0	460.0	2460.0	1.0	2000.0	2460.0	18	23
49	Lech 0.5		5	2.5	28.75	3.08	50.0	125.0	153.75	19	23
50	Fiat 126p		5	10000.0	11500.0	12300.0	5.0	50000.0	61500.0	19	23
\.


--
-- TOC entry 1860 (class 0 OID 16705)
-- Dependencies: 1535
-- Data for Name: rabat; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY rabat (id, wartosc_zakupow, wysokosc_rabatu) FROM stdin;
\.


--
-- TOC entry 1865 (class 0 OID 16825)
-- Dependencies: 1545
-- Data for Name: stawkavat; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY stawkavat (id, stawkavat, wartoscvat) FROM stdin;
2	8%	8
3	zw.	0
4	0	0
5	23%	23
6	22%	22
\.


--
-- TOC entry 1861 (class 0 OID 16713)
-- Dependencies: 1537
-- Data for Name: towar; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY towar (id, skrot, nazwa, pkwiu, jednm, cena_netto, vat, cena_brutto) FROM stdin;
3	laptop	HP ProBook 4320s		5	2000.0	23	2460.0
6	kodak	Ramka Foto KODAK W1030		5	500.0	23	615.0
5	lech	Lech 0.5		5	2.5	23	3.08
4	auto	Fiat 126p		5	10000.0	23	12300.0
7	aparat fuji	Fiji FinePix HS10	23.23.45	5	930.0	23	1143.9
\.


--
-- TOC entry 1864 (class 0 OID 16809)
-- Dependencies: 1543
-- Data for Name: wplata; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY wplata (id, datawplaty, kwota, faktura) FROM stdin;
\.


--
-- TOC entry 1846 (class 2606 OID 16773)
-- Dependencies: 1539 1539
-- Name: faktura_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY faktura
    ADD CONSTRAINT faktura_pkey PRIMARY KEY (id);


--
-- TOC entry 1840 (class 2606 OID 16702)
-- Dependencies: 1533 1533
-- Name: forma_platnosci_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY forma_platnosci
    ADD CONSTRAINT forma_platnosci_pkey PRIMARY KEY (id);


--
-- TOC entry 1838 (class 2606 OID 16694)
-- Dependencies: 1531 1531
-- Name: jednostka_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY jednostka
    ADD CONSTRAINT jednostka_pkey PRIMARY KEY (id);


--
-- TOC entry 1836 (class 2606 OID 16672)
-- Dependencies: 1529 1529
-- Name: kontrahent_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY kontrahent
    ADD CONSTRAINT kontrahent_pkey PRIMARY KEY (id);


--
-- TOC entry 1848 (class 2606 OID 16801)
-- Dependencies: 1541 1541
-- Name: pozycja_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY pozycja
    ADD CONSTRAINT pozycja_pkey PRIMARY KEY (id);


--
-- TOC entry 1842 (class 2606 OID 16710)
-- Dependencies: 1535 1535
-- Name: rabat_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY rabat
    ADD CONSTRAINT rabat_pkey PRIMARY KEY (id);


--
-- TOC entry 1852 (class 2606 OID 16830)
-- Dependencies: 1545 1545
-- Name: stawkavat_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY stawkavat
    ADD CONSTRAINT stawkavat_pkey PRIMARY KEY (id);


--
-- TOC entry 1844 (class 2606 OID 16722)
-- Dependencies: 1537 1537
-- Name: towar_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY towar
    ADD CONSTRAINT towar_pkey PRIMARY KEY (id);


--
-- TOC entry 1850 (class 2606 OID 16817)
-- Dependencies: 1543 1543
-- Name: wplata_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY wplata
    ADD CONSTRAINT wplata_pkey PRIMARY KEY (id);


--
-- TOC entry 1854 (class 2606 OID 16774)
-- Dependencies: 1835 1529 1539
-- Name: faktura_kontrahent_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY faktura
    ADD CONSTRAINT faktura_kontrahent_fkey FOREIGN KEY (kontrahent) REFERENCES kontrahent(id);


--
-- TOC entry 1855 (class 2606 OID 16802)
-- Dependencies: 1539 1845 1541
-- Name: pozycja_faktura_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY pozycja
    ADD CONSTRAINT pozycja_faktura_fkey FOREIGN KEY (faktura) REFERENCES faktura(id);


--
-- TOC entry 1853 (class 2606 OID 16723)
-- Dependencies: 1837 1537 1531
-- Name: towar_jednm_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY towar
    ADD CONSTRAINT towar_jednm_fkey FOREIGN KEY (jednm) REFERENCES jednostka(id);


--
-- TOC entry 1856 (class 2606 OID 16818)
-- Dependencies: 1539 1845 1543
-- Name: wplata_faktura_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY wplata
    ADD CONSTRAINT wplata_faktura_fkey FOREIGN KEY (faktura) REFERENCES faktura(id);


--
-- TOC entry 1870 (class 0 OID 0)
-- Dependencies: 5
-- Name: public; Type: ACL; Schema: -; Owner: postgres
--

REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM postgres;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO PUBLIC;


-- Completed on 2011-06-04 19:02:45

--
-- PostgreSQL database dump complete
--

