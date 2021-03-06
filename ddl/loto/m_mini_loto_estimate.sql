-- Table: public.m_mini_loto_estimate

-- DROP TABLE public.m_mini_loto_estimate;

CREATE TABLE public.m_mini_loto_estimate
(
    user_id integer NOT NULL,
    id integer NOT NULL,
    turn integer NOT NULL,
    l1 integer NOT NULL,
    l2 integer NOT NULL,
    l3 integer NOT NULL,
    l4 integer NOT NULL,
    l5 integer NOT NULL,
    l6 integer NOT NULL,
    point integer NOT NULL,
    buyFlag integer NOT NULL,
    memo character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT m_mini_loto_estimate_pkey PRIMARY KEY (user_id, id, turn)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.m_mini_loto_estimate
    OWNER to postgres;