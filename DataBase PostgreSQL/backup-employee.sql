PGDMP                 	        x            employed-bdb    12.3    12.3                0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false                       1262    16546    employed-bdb    DATABASE     �   CREATE DATABASE "employed-bdb" WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'Spanish_Colombia.1252' LC_CTYPE = 'Spanish_Colombia.1252';
    DROP DATABASE "employed-bdb";
                postgres    false            �            1259    16547    employee    TABLE     �   CREATE TABLE public.employee (
    emp_id bigint NOT NULL,
    emp_name text NOT NULL,
    emp_function text NOT NULL,
    emp_date_admission date,
    emp_salary bigint,
    emp_boss_id bigint
);
    DROP TABLE public.employee;
       public         heap    postgres    false            �
          0    16547    employee 
   TABLE DATA           o   COPY public.employee (emp_id, emp_name, emp_function, emp_date_admission, emp_salary, emp_boss_id) FROM stdin;
    public          postgres    false    202   `       
           2606    16554    employee emp_id_pk 
   CONSTRAINT     T   ALTER TABLE ONLY public.employee
    ADD CONSTRAINT emp_id_pk PRIMARY KEY (emp_id);
 <   ALTER TABLE ONLY public.employee DROP CONSTRAINT emp_id_pk;
       public            postgres    false    202            �
           2606    16555    employee emp_id_fk    FK CONSTRAINT     �   ALTER TABLE ONLY public.employee
    ADD CONSTRAINT emp_id_fk FOREIGN KEY (emp_boss_id) REFERENCES public.employee(emp_id) NOT VALID;
 <   ALTER TABLE ONLY public.employee DROP CONSTRAINT emp_id_fk;
       public          postgres    false    202    2687    202            �
   �   x����
�0Eד��D�����Bq�k�&4���Lm~��-�K����s��A�1<P�À�`��c��'�u�1d�l�1ʔc�a`�<c'�H��_sVt9r;+�(��֥�䱏��k���$O}HM��G���	�n���a���I^B�G�WlRhh��JJg`Ɋ�J��iK|     