-- Database: sivoldb

-- DROP DATABASE sivoldb;

CREATE DATABASE sivoldb
  WITH OWNER = postgres
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
       LC_COLLATE = 'Spanish_Spain.1252'
       LC_CTYPE = 'Spanish_Spain.1252'
       CONNECTION LIMIT = -1;



/*==============================================================*/
/* DBMS name:      PostgreSQL 7.3                               */
/* Created on:     14/05/2017 23:33:24                          */
/*==============================================================*/


drop index TIPO_ALERTA_ALERTA_FK;

drop index MAESTRO_PERSONA_ALERTA_FK;

drop index SIVOL_ALERTA_PK;

drop table SIVOL_ALERTA;

drop index SIVOL_BODEGA_PK;

drop table SIVOL_BODEGA;

drop index TIPO_ESTADO_REP_DESP_VEH_FK;

drop index VEHICULO_DESP_VEHICULO_FK;

drop index SIVOL_DESPERFECTO_VEHICULO_PK;

drop table SIVOL_DESPERFECTO_VEHICULO;

drop index SIVOL_ESTADO_VEHICULO_PK;

drop table SIVOL_ESTADO_VEHICULO;

drop index PERSONA_CONTACTO_FK;

drop index SIVOL_MAESTRO_PERSONA_PK;

drop table SIVOL_MAESTRO_PERSONA;

drop index SIVOL_MARCA_VEHICULO_PK;

drop table SIVOL_MARCA_VEHICULO;

drop index PERMISO_MENU_ITEM_FK;

drop index SIVOL_MENU_ITEM_PK;

drop table SIVOL_MENU_ITEM;

drop index MARCA_VEHICULO_MODELO_MARCA_FK;

drop index SIVOL_MODELO_MARCA_PK;

drop table SIVOL_MODELO_MARCA;

drop index TIPO_MUL_MUL_VEH_FK;

drop index VEHICULO_GALERIA_VEHICULO_FK;

drop index SIVOL_MULTIMEDIA_VEHICULO_PK;

drop table SIVOL_MULTIMEDIA_VEHICULO;

drop index MAESTRO_PERSONA_OPERACION_FK;

drop index TIPO_OPERACION_OPERACION_FK;

drop index SIVOL_OPERACION_PK;

drop table SIVOL_OPERACION;

drop index SIVOL_PARAM_GRALES_PK;

drop table SIVOL_PARAM_GRALES;

drop index PERMISO_PERFIL_FK;

drop index SIVOL_PERFIL_PK;

drop table SIVOL_PERFIL;

drop index SIVOL_PERMISO_PK;

drop table SIVOL_PERMISO;

drop index BODEGA_PISO_BODEGA_FK;

drop index SIVOL_PISO_BODEGA_PK;

drop table SIVOL_PISO_BODEGA;

drop index SIVOL_REMOLCADOR_PK;

drop table SIVOL_REMOLCADOR;

drop index SIVOL_TALLER_AFILIADO_PK;

drop table SIVOL_TALLER_AFILIADO;

drop index SIVOL_TIPO_ALERTA_PK;

drop table SIVOL_TIPO_ALERTA;

drop index SIVOL_TIPO_ESTADO_REPARACION_PK;

drop table SIVOL_TIPO_ESTADO_REPARACION;

drop index SIVOL_TIPO_MULTIMEDIA_PK;

drop table SIVOL_TIPO_MULTIMEDIA;

drop index SIVOL_TIPO_OPERACION_PK;

drop table SIVOL_TIPO_OPERACION;

drop index PERFIL_TIPO_USUARIO_FK;

drop index SIVOL_TIPO_USUARIO_PK;

drop table SIVOL_TIPO_USUARIO;

drop index USUARIO_MAESTRO_PERSONA_FK;

drop index TIPO_USUARIO_USUARIO_FK;

drop index SIVOL_USUARIO_PK;

drop table SIVOL_USUARIO;

drop index MODELO_MARCA_VEHICULO_FK;

drop index RELATIONSHIP_19_FK;

drop index OPERACION_VEHICULO_FK;

drop index ESTADO_VEHICULO_VEHICULO_FK;

drop index TALLER_AFILIADO_VEHICULO_FK;

drop index REMOLCADOR_VEHICULO_FK;

drop index PISO_BODEGA_VEHICULO_FK;

drop index SIVOL_VEHICULO_PK;

drop table SIVOL_VEHICULO;

/*==============================================================*/
/* Table: SIVOL_ALERTA                                          */
/*==============================================================*/
create table SIVOL_ALERTA (
ALE_CODIGO           INT4                 not null,
MAEPER_CODIGO        INT4                 not null,
TIPALE_CODIGO        INT4                 not null,
ALE_NOMBRE           CHAR(150)            null,
ALE_DESCRIPCION      CHAR(500)            null,
ALE_FECHA_CREACION   DATE                 null,
ALE_FECHA_MODIFICACION DATE                 null,
constraint PK_SIVOL_ALERTA primary key (ALE_CODIGO)
);

/*==============================================================*/
/* Index: SIVOL_ALERTA_PK                                       */
/*==============================================================*/
create unique index SIVOL_ALERTA_PK on SIVOL_ALERTA (
ALE_CODIGO
);

/*==============================================================*/
/* Index: MAESTRO_PERSONA_ALERTA_FK                             */
/*==============================================================*/
create  index MAESTRO_PERSONA_ALERTA_FK on SIVOL_ALERTA (
MAEPER_CODIGO
);

/*==============================================================*/
/* Index: TIPO_ALERTA_ALERTA_FK                                 */
/*==============================================================*/
create  index TIPO_ALERTA_ALERTA_FK on SIVOL_ALERTA (
TIPALE_CODIGO
);

/*==============================================================*/
/* Table: SIVOL_BODEGA                                          */
/*==============================================================*/
create table SIVOL_BODEGA (
BOD_CODIGO           CHAR(4)              not null,
BOD_NOMBRE           CHAR(150)            null,
BOD_FECHA_CREACION   DATE                 null,
BOD_FECHA_MODIFICACION DATE                 null,
BOD_TARIFA_DIA       DECIMAL(15,2)        null,
BOD_DIRECCION        CHAR(500)            null,
constraint PK_SIVOL_BODEGA primary key (BOD_CODIGO)
);

/*==============================================================*/
/* Index: SIVOL_BODEGA_PK                                       */
/*==============================================================*/
create unique index SIVOL_BODEGA_PK on SIVOL_BODEGA (
BOD_CODIGO
);

/*==============================================================*/
/* Table: SIVOL_DESPERFECTO_VEHICULO                            */
/*==============================================================*/
create table SIVOL_DESPERFECTO_VEHICULO (
DESVEH_CODIGO        INT4                 not null,
VEH_CODIGO           INT4                 not null,
TIPESTREP_CODIGO     INT4                 not null,
DESVEH_DESCRIPCION   CHAR(500)            null,
DESVEH_FECHA_CREACION DATE                 null,
DESVEH_FECHA_MODIFICACION DATE                 null,
DESVEH_COSTO         DECIMAL(15,2)        null,
constraint PK_SIVOL_DESPERFECTO_VEHICULO primary key (DESVEH_CODIGO)
);

/*==============================================================*/
/* Index: SIVOL_DESPERFECTO_VEHICULO_PK                         */
/*==============================================================*/
create unique index SIVOL_DESPERFECTO_VEHICULO_PK on SIVOL_DESPERFECTO_VEHICULO (
DESVEH_CODIGO
);

/*==============================================================*/
/* Index: VEHICULO_DESP_VEHICULO_FK                             */
/*==============================================================*/
create  index VEHICULO_DESP_VEHICULO_FK on SIVOL_DESPERFECTO_VEHICULO (
VEH_CODIGO
);

/*==============================================================*/
/* Index: TIPO_ESTADO_REP_DESP_VEH_FK                           */
/*==============================================================*/
create  index TIPO_ESTADO_REP_DESP_VEH_FK on SIVOL_DESPERFECTO_VEHICULO (
TIPESTREP_CODIGO
);

/*==============================================================*/
/* Table: SIVOL_ESTADO_VEHICULO                                 */
/*==============================================================*/
create table SIVOL_ESTADO_VEHICULO (
ESTVEH_CODIGO        INT4                 not null,
ESTVEH_NOMBRE        CHAR(150)            null,
ESTVEH_DESCRIPCION   CHAR(500)            null,
ESTVEH_FECHA_CREACION DATE                 null,
ESTVEH_FECHA_MODIFICACION DATE                 null,
constraint PK_SIVOL_ESTADO_VEHICULO primary key (ESTVEH_CODIGO)
);

/*==============================================================*/
/* Index: SIVOL_ESTADO_VEHICULO_PK                              */
/*==============================================================*/
create unique index SIVOL_ESTADO_VEHICULO_PK on SIVOL_ESTADO_VEHICULO (
ESTVEH_CODIGO
);

/*==============================================================*/
/* Table: SIVOL_MAESTRO_PERSONA                                 */
/*==============================================================*/
create table SIVOL_MAESTRO_PERSONA (
MAEPER_CODIGO        INT4                 not null,
SIV_MAEPER_CODIGO    INT4                 null,
MAEPER_NOMBRE        CHAR(100)            null,
MAEPER_APELLIDO      CHAR(100)            null,
MAEPER_APELLIDO_CASADA CHAR(100)            null,
MAEPER_GENERO        CHAR(1)              null,
MAEPER_FECHA_NACIMIENTO DATE                 null,
MAEPER_DIRECCION     CHAR(256)            null,
MAEPER_TEL_MOVIL     INT4                 null,
MAEPER_TEL_CASA      INT4                 null,
MAEPER_CORREO        CHAR(50)             null,
MAEPER_NIT           CHAR(14)             null,
MAEPER_CONTEO_VEHICULOS INT4                 null,
constraint PK_SIVOL_MAESTRO_PERSONA primary key (MAEPER_CODIGO)
);

/*==============================================================*/
/* Index: SIVOL_MAESTRO_PERSONA_PK                              */
/*==============================================================*/
create unique index SIVOL_MAESTRO_PERSONA_PK on SIVOL_MAESTRO_PERSONA (
MAEPER_CODIGO
);

/*==============================================================*/
/* Index: PERSONA_CONTACTO_FK                                   */
/*==============================================================*/
create  index PERSONA_CONTACTO_FK on SIVOL_MAESTRO_PERSONA (
SIV_MAEPER_CODIGO
);

/*==============================================================*/
/* Table: SIVOL_MARCA_VEHICULO                                  */
/*==============================================================*/
create table SIVOL_MARCA_VEHICULO (
MARVEH_CODIGO        CHAR(3)              not null,
MARVEH_NOMBRE        CHAR(150)            null,
MARVEH_FECHA_CREACION DATE                 null,
MARVEH_FECHA_MODIFICAION DATE                 null,
constraint PK_SIVOL_MARCA_VEHICULO primary key (MARVEH_CODIGO)
);

/*==============================================================*/
/* Index: SIVOL_MARCA_VEHICULO_PK                               */
/*==============================================================*/
create unique index SIVOL_MARCA_VEHICULO_PK on SIVOL_MARCA_VEHICULO (
MARVEH_CODIGO
);

/*==============================================================*/
/* Table: SIVOL_MENU_ITEM                                       */
/*==============================================================*/
create table SIVOL_MENU_ITEM (
MENITE_CODIGO        INT4                 not null,
PER_CODIGO           INT4                 not null,
MENITE_NOMBRE        CHAR(150)            null,
MENITE_DESCRIPCION   CHAR(500)            null,
MENITE_URL           CHAR(256)            null,
MENITE_FECHA_CREACION DATE                 null,
MENITE_FECHA_MODIFICACION DATE                 null,
constraint PK_SIVOL_MENU_ITEM primary key (MENITE_CODIGO)
);

/*==============================================================*/
/* Index: SIVOL_MENU_ITEM_PK                                    */
/*==============================================================*/
create unique index SIVOL_MENU_ITEM_PK on SIVOL_MENU_ITEM (
MENITE_CODIGO
);

/*==============================================================*/
/* Index: PERMISO_MENU_ITEM_FK                                  */
/*==============================================================*/
create  index PERMISO_MENU_ITEM_FK on SIVOL_MENU_ITEM (
PER_CODIGO
);

/*==============================================================*/
/* Table: SIVOL_MODELO_MARCA                                    */
/*==============================================================*/
create table SIVOL_MODELO_MARCA (
MODMAR_CODIGO        INT4                 not null,
MARVEH_CODIGO        CHAR(3)              not null,
MODMAR_NOMBRE        CHAR(150)            null,
MODMAR_FECHA_CREACION DATE                 null,
MODMAR_FECHA_MODIFICACION DATE                 null,
constraint PK_SIVOL_MODELO_MARCA primary key (MODMAR_CODIGO)
);

/*==============================================================*/
/* Index: SIVOL_MODELO_MARCA_PK                                 */
/*==============================================================*/
create unique index SIVOL_MODELO_MARCA_PK on SIVOL_MODELO_MARCA (
MODMAR_CODIGO
);

/*==============================================================*/
/* Index: MARCA_VEHICULO_MODELO_MARCA_FK                        */
/*==============================================================*/
create  index MARCA_VEHICULO_MODELO_MARCA_FK on SIVOL_MODELO_MARCA (
MARVEH_CODIGO
);

/*==============================================================*/
/* Table: SIVOL_MULTIMEDIA_VEHICULO                             */
/*==============================================================*/
create table SIVOL_MULTIMEDIA_VEHICULO (
MULVEH_CODIGO        INT4                 not null,
VEH_CODIGO           INT4                 not null,
TIPMUL_CODIGO        INT4                 not null,
MULVEH_TITULO        CHAR(150)            null,
MULVEH_URL           CHAR(256)            null,
MULVEH_FECHA_CREACION DATE                 null,
MULVEH_FECHA_MODIFICACION DATE                 null,
constraint PK_SIVOL_MULTIMEDIA_VEHICULO primary key (MULVEH_CODIGO)
);

/*==============================================================*/
/* Index: SIVOL_MULTIMEDIA_VEHICULO_PK                          */
/*==============================================================*/
create unique index SIVOL_MULTIMEDIA_VEHICULO_PK on SIVOL_MULTIMEDIA_VEHICULO (
MULVEH_CODIGO
);

/*==============================================================*/
/* Index: VEHICULO_GALERIA_VEHICULO_FK                          */
/*==============================================================*/
create  index VEHICULO_GALERIA_VEHICULO_FK on SIVOL_MULTIMEDIA_VEHICULO (
VEH_CODIGO
);

/*==============================================================*/
/* Index: TIPO_MUL_MUL_VEH_FK                                   */
/*==============================================================*/
create  index TIPO_MUL_MUL_VEH_FK on SIVOL_MULTIMEDIA_VEHICULO (
TIPMUL_CODIGO
);

/*==============================================================*/
/* Table: SIVOL_OPERACION                                       */
/*==============================================================*/
create table SIVOL_OPERACION (
OPE_CODIGO           INT4                 not null,
TIPOPE_CODIGO        INT4                 not null,
MAEPER_CODIGO        INT4                 not null,
OPE_DESCRIPCION      CHAR(500)            null,
OPE_FECHA_CREACION   DATE                 null,
OPE_FECHA_MODIFICACION DATE                 null,
OPE_COD_AUTORIZA     INT4                 null,
constraint PK_SIVOL_OPERACION primary key (OPE_CODIGO)
);

/*==============================================================*/
/* Index: SIVOL_OPERACION_PK                                    */
/*==============================================================*/
create unique index SIVOL_OPERACION_PK on SIVOL_OPERACION (
OPE_CODIGO
);

/*==============================================================*/
/* Index: TIPO_OPERACION_OPERACION_FK                           */
/*==============================================================*/
create  index TIPO_OPERACION_OPERACION_FK on SIVOL_OPERACION (
TIPOPE_CODIGO
);

/*==============================================================*/
/* Index: MAESTRO_PERSONA_OPERACION_FK                          */
/*==============================================================*/
create  index MAESTRO_PERSONA_OPERACION_FK on SIVOL_OPERACION (
MAEPER_CODIGO
);

/*==============================================================*/
/* Table: SIVOL_PARAM_GRALES                                    */
/*==============================================================*/
create table SIVOL_PARAM_GRALES (
PARGRA_CODIGO_EMPRESA INT4                 not null,
PARGRA_NOMBRE_EMPRESA CHAR(256)            null,
PARGRA_LOGO_EMPRESA  CHAR                 null,
PARGRA_IMGS_X_VEHICULO INT4                 null,
PARGRA_ANTIGU_PERMITIDA INT4                 null,
PARGRA_VEH_PERMITIDOS INT4                 null,
constraint PK_SIVOL_PARAM_GRALES primary key (PARGRA_CODIGO_EMPRESA)
);

/*==============================================================*/
/* Index: SIVOL_PARAM_GRALES_PK                                 */
/*==============================================================*/
create unique index SIVOL_PARAM_GRALES_PK on SIVOL_PARAM_GRALES (
PARGRA_CODIGO_EMPRESA
);

/*==============================================================*/
/* Table: SIVOL_PERFIL                                          */
/*==============================================================*/
create table SIVOL_PERFIL (
PEF_CODIGO           INT4                 not null,
PER_CODIGO           INT4                 not null,
PEF_NOMBRE           CHAR(150)            null,
PEF_DESCRIPCION      CHAR(500)            null,
PEF_FECHA_CREACION   DATE                 null,
PEF_FECHA_MODIFICACION DATE                 null,
constraint PK_SIVOL_PERFIL primary key (PEF_CODIGO)
);

/*==============================================================*/
/* Index: SIVOL_PERFIL_PK                                       */
/*==============================================================*/
create unique index SIVOL_PERFIL_PK on SIVOL_PERFIL (
PEF_CODIGO
);

/*==============================================================*/
/* Index: PERMISO_PERFIL_FK                                     */
/*==============================================================*/
create  index PERMISO_PERFIL_FK on SIVOL_PERFIL (
PER_CODIGO
);

/*==============================================================*/
/* Table: SIVOL_PERMISO                                         */
/*==============================================================*/
create table SIVOL_PERMISO (
PER_CODIGO           INT4                 not null,
PER_ESTADO           CHAR(1)              null,
constraint PK_SIVOL_PERMISO primary key (PER_CODIGO)
);

/*==============================================================*/
/* Index: SIVOL_PERMISO_PK                                      */
/*==============================================================*/
create unique index SIVOL_PERMISO_PK on SIVOL_PERMISO (
PER_CODIGO
);

/*==============================================================*/
/* Table: SIVOL_PISO_BODEGA                                     */
/*==============================================================*/
create table SIVOL_PISO_BODEGA (
PISBOD_CODIGO        INT4                 not null,
BOD_CODIGO           CHAR(4)              not null,
PISBOD_CAPACIDAD     INT4                 null,
PISBOD_TOTAL_VEHICULO INT4                 null,
PISBOD_COSTO_ALQUILER DECIMAL(15,2)        null,
constraint PK_SIVOL_PISO_BODEGA primary key (PISBOD_CODIGO)
);

/*==============================================================*/
/* Index: SIVOL_PISO_BODEGA_PK                                  */
/*==============================================================*/
create unique index SIVOL_PISO_BODEGA_PK on SIVOL_PISO_BODEGA (
PISBOD_CODIGO
);

/*==============================================================*/
/* Index: BODEGA_PISO_BODEGA_FK                                 */
/*==============================================================*/
create  index BODEGA_PISO_BODEGA_FK on SIVOL_PISO_BODEGA (
BOD_CODIGO
);

/*==============================================================*/
/* Table: SIVOL_REMOLCADOR                                      */
/*==============================================================*/
create table SIVOL_REMOLCADOR (
REM_CODIGO           INT4                 not null,
REM_DESCRIPCION      CHAR(500)            null,
REM_CAPACIDAD        INT4                 null,
REM_FECHA_CREACION   DATE                 null,
REM_FECHA_MODIFICACION DATE                 null,
constraint PK_SIVOL_REMOLCADOR primary key (REM_CODIGO)
);

/*==============================================================*/
/* Index: SIVOL_REMOLCADOR_PK                                   */
/*==============================================================*/
create unique index SIVOL_REMOLCADOR_PK on SIVOL_REMOLCADOR (
REM_CODIGO
);

/*==============================================================*/
/* Table: SIVOL_TALLER_AFILIADO                                 */
/*==============================================================*/
create table SIVOL_TALLER_AFILIADO (
TALAFI_CODIGO        INT4                 not null,
TALAFI_NOMBRE        CHAR(150)            null,
TALAFI_ESTADO        CHAR(1)              null,
TALAFI_CONTACTO      CHAR(150)            null,
TALAFI_DIRECCION     CHAR(500)            null,
TALAFI_TELEFONO      INT4                 null,
constraint PK_SIVOL_TALLER_AFILIADO primary key (TALAFI_CODIGO)
);

/*==============================================================*/
/* Index: SIVOL_TALLER_AFILIADO_PK                              */
/*==============================================================*/
create unique index SIVOL_TALLER_AFILIADO_PK on SIVOL_TALLER_AFILIADO (
TALAFI_CODIGO
);

/*==============================================================*/
/* Table: SIVOL_TIPO_ALERTA                                     */
/*==============================================================*/
create table SIVOL_TIPO_ALERTA (
TIPALE_CODIGO        INT4                 not null,
TIPALE_NOMBRE        CHAR(150)            null,
TIPALE_DESCRIPCION   CHAR(500)            null,
TIPALE_FECHA_CREACION DATE                 null,
TIPALE_FECHA_MODIFICACION DATE                 null,
TIPALE_ESTADO        CHAR(1)              null,
constraint PK_SIVOL_TIPO_ALERTA primary key (TIPALE_CODIGO)
);

/*==============================================================*/
/* Index: SIVOL_TIPO_ALERTA_PK                                  */
/*==============================================================*/
create unique index SIVOL_TIPO_ALERTA_PK on SIVOL_TIPO_ALERTA (
TIPALE_CODIGO
);

/*==============================================================*/
/* Table: SIVOL_TIPO_ESTADO_REPARACION                          */
/*==============================================================*/
create table SIVOL_TIPO_ESTADO_REPARACION (
TIPESTREP_CODIGO     INT4                 not null,
TIPESTREP_NOMBRE     CHAR(150)            null,
TIPESTREP_DESCRIPCION CHAR(500)            null,
TIPESTREP_FECHA_CREACION DATE                 null,
TIPESTREP_FECHA_MODIFICACION DATE                 null,
constraint PK_SIVOL_TIPO_ESTADO_REPARACIO primary key (TIPESTREP_CODIGO)
);

/*==============================================================*/
/* Index: SIVOL_TIPO_ESTADO_REPARACION_PK                       */
/*==============================================================*/
create unique index SIVOL_TIPO_ESTADO_REPARACION_PK on SIVOL_TIPO_ESTADO_REPARACION (
TIPESTREP_CODIGO
);

/*==============================================================*/
/* Table: SIVOL_TIPO_MULTIMEDIA                                 */
/*==============================================================*/
create table SIVOL_TIPO_MULTIMEDIA (
TIPMUL_CODIGO        INT4                 not null,
TIPMUL_DESCRIPCION   CHAR(500)            null,
TIPMUL_EXTENSIONES   CHAR(4)              null,
TIPMUL_FECHA_CREACION DATE                 null,
TIPMUL_FECHA_MODIFICACION DATE                 null,
constraint PK_SIVOL_TIPO_MULTIMEDIA primary key (TIPMUL_CODIGO)
);

/*==============================================================*/
/* Index: SIVOL_TIPO_MULTIMEDIA_PK                              */
/*==============================================================*/
create unique index SIVOL_TIPO_MULTIMEDIA_PK on SIVOL_TIPO_MULTIMEDIA (
TIPMUL_CODIGO
);

/*==============================================================*/
/* Table: SIVOL_TIPO_OPERACION                                  */
/*==============================================================*/
create table SIVOL_TIPO_OPERACION (
TIPOPE_CODIGO        INT4                 not null,
TIPOPE_DESCRIPCION   CHAR(500)            null,
TIPOPE_NOMBRE        CHAR(150)            null,
TIPOPE_FECHA_CREACION DATE                 null,
TIPOPE_FECHA_MODIFICACION DATE                 null,
constraint PK_SIVOL_TIPO_OPERACION primary key (TIPOPE_CODIGO)
);

/*==============================================================*/
/* Index: SIVOL_TIPO_OPERACION_PK                               */
/*==============================================================*/
create unique index SIVOL_TIPO_OPERACION_PK on SIVOL_TIPO_OPERACION (
TIPOPE_CODIGO
);

/*==============================================================*/
/* Table: SIVOL_TIPO_USUARIO                                    */
/*==============================================================*/
create table SIVOL_TIPO_USUARIO (
TIPUSU_CODIGO        INT4                 not null,
PEF_CODIGO           INT4                 not null,
TIPUSU_DESCRIPCION   CHAR(150)            null,
TIPUSU_FECHA_CREACION DATE                 null,
TIPUSU_FECHA_MODIF   DATE                 null,
constraint PK_SIVOL_TIPO_USUARIO primary key (TIPUSU_CODIGO)
);

/*==============================================================*/
/* Index: SIVOL_TIPO_USUARIO_PK                                 */
/*==============================================================*/
create unique index SIVOL_TIPO_USUARIO_PK on SIVOL_TIPO_USUARIO (
TIPUSU_CODIGO
);

/*==============================================================*/
/* Index: PERFIL_TIPO_USUARIO_FK                                */
/*==============================================================*/
create  index PERFIL_TIPO_USUARIO_FK on SIVOL_TIPO_USUARIO (
PEF_CODIGO
);

/*==============================================================*/
/* Table: SIVOL_USUARIO                                         */
/*==============================================================*/
create table SIVOL_USUARIO (
USU_USUARIO          CHAR(10)             not null,
TIPUSU_CODIGO        INT4                 not null,
MAEPER_CODIGO        INT4                 not null,
USU_ESTADO           INT4                 null,
USU_TIPO             INT4                 null,
USU_CONTRASENA       CHAR(64)             null,
USU_FECHA_CREACION   DATE                 null,
USU_FECHA_MODIFICACION DATE                 null,
constraint PK_SIVOL_USUARIO primary key (USU_USUARIO)
);

/*==============================================================*/
/* Index: SIVOL_USUARIO_PK                                      */
/*==============================================================*/
create unique index SIVOL_USUARIO_PK on SIVOL_USUARIO (
USU_USUARIO
);

/*==============================================================*/
/* Index: TIPO_USUARIO_USUARIO_FK                               */
/*==============================================================*/
create  index TIPO_USUARIO_USUARIO_FK on SIVOL_USUARIO (
TIPUSU_CODIGO
);

/*==============================================================*/
/* Index: USUARIO_MAESTRO_PERSONA_FK                            */
/*==============================================================*/
create  index USUARIO_MAESTRO_PERSONA_FK on SIVOL_USUARIO (
MAEPER_CODIGO
);

/*==============================================================*/
/* Table: SIVOL_VEHICULO                                        */
/*==============================================================*/
create table SIVOL_VEHICULO (
VEH_CODIGO           INT4                 not null,
PISBOD_CODIGO        INT4                 not null,
REM_CODIGO           INT4                 not null,
TALAFI_CODIGO        INT4                 not null,
ESTVEH_CODIGO        INT4                 not null,
OPE_CODIGO           INT4                 not null,
MARVEH_CODIGO        CHAR(3)              null,
MODMAR_CODIGO        INT4                 not null,
VEH_ANIO             INT4                 null,
VEH_UBICACION        CHAR(12)             null,
VEH_PORC_AVANCE      DECIMAL(5,2)         null,
VEH_FECHA_IMPOR      DATE                 null,
VEH_FECHA_MODIFICACION DATE                 null,
VEH_COSTO            DECIMAL(15,2)        null,
VEH_DESCRIPCION      CHAR(500)            null,
VEH_COSTO_ALQUILER   DECIMAL(15,2)        null,
constraint PK_SIVOL_VEHICULO primary key (VEH_CODIGO)
);

/*==============================================================*/
/* Index: SIVOL_VEHICULO_PK                                     */
/*==============================================================*/
create unique index SIVOL_VEHICULO_PK on SIVOL_VEHICULO (
VEH_CODIGO
);

/*==============================================================*/
/* Index: PISO_BODEGA_VEHICULO_FK                               */
/*==============================================================*/
create  index PISO_BODEGA_VEHICULO_FK on SIVOL_VEHICULO (
PISBOD_CODIGO
);

/*==============================================================*/
/* Index: REMOLCADOR_VEHICULO_FK                                */
/*==============================================================*/
create  index REMOLCADOR_VEHICULO_FK on SIVOL_VEHICULO (
REM_CODIGO
);

/*==============================================================*/
/* Index: TALLER_AFILIADO_VEHICULO_FK                           */
/*==============================================================*/
create  index TALLER_AFILIADO_VEHICULO_FK on SIVOL_VEHICULO (
TALAFI_CODIGO
);

/*==============================================================*/
/* Index: ESTADO_VEHICULO_VEHICULO_FK                           */
/*==============================================================*/
create  index ESTADO_VEHICULO_VEHICULO_FK on SIVOL_VEHICULO (
ESTVEH_CODIGO
);

/*==============================================================*/
/* Index: OPERACION_VEHICULO_FK                                 */
/*==============================================================*/
create  index OPERACION_VEHICULO_FK on SIVOL_VEHICULO (
OPE_CODIGO
);

/*==============================================================*/
/* Index: RELATIONSHIP_19_FK                                    */
/*==============================================================*/
create  index RELATIONSHIP_19_FK on SIVOL_VEHICULO (
MARVEH_CODIGO
);

/*==============================================================*/
/* Index: MODELO_MARCA_VEHICULO_FK                              */
/*==============================================================*/
create  index MODELO_MARCA_VEHICULO_FK on SIVOL_VEHICULO (
MODMAR_CODIGO
);

alter table SIVOL_ALERTA
   add constraint FK_SIVOL_AL_MAESTRO_P_SIVOL_MA foreign key (MAEPER_CODIGO)
      references SIVOL_MAESTRO_PERSONA (MAEPER_CODIGO)
      on delete restrict on update restrict;

alter table SIVOL_ALERTA
   add constraint FK_SIVOL_AL_TIPO_ALER_SIVOL_TI foreign key (TIPALE_CODIGO)
      references SIVOL_TIPO_ALERTA (TIPALE_CODIGO)
      on delete restrict on update restrict;

alter table SIVOL_DESPERFECTO_VEHICULO
   add constraint FK_SIVOL_DE_TIPO_ESTA_SIVOL_TI foreign key (TIPESTREP_CODIGO)
      references SIVOL_TIPO_ESTADO_REPARACION (TIPESTREP_CODIGO)
      on delete restrict on update restrict;

alter table SIVOL_DESPERFECTO_VEHICULO
   add constraint FK_SIVOL_DE_VEHICULO__SIVOL_VE foreign key (VEH_CODIGO)
      references SIVOL_VEHICULO (VEH_CODIGO)
      on delete restrict on update restrict;

alter table SIVOL_MAESTRO_PERSONA
   add constraint FK_SIVOL_MA_PERSONA_C_SIVOL_MA foreign key (SIV_MAEPER_CODIGO)
      references SIVOL_MAESTRO_PERSONA (MAEPER_CODIGO)
      on delete restrict on update restrict;

alter table SIVOL_MENU_ITEM
   add constraint FK_SIVOL_ME_PERMISO_M_SIVOL_PE foreign key (PER_CODIGO)
      references SIVOL_PERMISO (PER_CODIGO)
      on delete restrict on update restrict;

alter table SIVOL_MODELO_MARCA
   add constraint FK_SIVOL_MO_MARCA_VEH_SIVOL_MA foreign key (MARVEH_CODIGO)
      references SIVOL_MARCA_VEHICULO (MARVEH_CODIGO)
      on delete restrict on update restrict;

alter table SIVOL_MULTIMEDIA_VEHICULO
   add constraint FK_SIVOL_MU_TIPO_MULT_SIVOL_TI foreign key (TIPMUL_CODIGO)
      references SIVOL_TIPO_MULTIMEDIA (TIPMUL_CODIGO)
      on delete restrict on update restrict;

alter table SIVOL_MULTIMEDIA_VEHICULO
   add constraint FK_SIVOL_MU_VEHICULO__SIVOL_VE foreign key (VEH_CODIGO)
      references SIVOL_VEHICULO (VEH_CODIGO)
      on delete restrict on update restrict;

alter table SIVOL_OPERACION
   add constraint FK_SIVOL_OP_MAESTRO_P_SIVOL_MA foreign key (MAEPER_CODIGO)
      references SIVOL_MAESTRO_PERSONA (MAEPER_CODIGO)
      on delete restrict on update restrict;

alter table SIVOL_OPERACION
   add constraint FK_SIVOL_OP_TIPO_OPER_SIVOL_TI foreign key (TIPOPE_CODIGO)
      references SIVOL_TIPO_OPERACION (TIPOPE_CODIGO)
      on delete restrict on update restrict;

alter table SIVOL_PERFIL
   add constraint FK_SIVOL_PE_PERMISO_P_SIVOL_PE foreign key (PER_CODIGO)
      references SIVOL_PERMISO (PER_CODIGO)
      on delete restrict on update restrict;

alter table SIVOL_PISO_BODEGA
   add constraint FK_SIVOL_PI_BODEGA_PI_SIVOL_BO foreign key (BOD_CODIGO)
      references SIVOL_BODEGA (BOD_CODIGO)
      on delete restrict on update restrict;

alter table SIVOL_TIPO_USUARIO
   add constraint FK_SIVOL_TI_PERFIL_TI_SIVOL_PE foreign key (PEF_CODIGO)
      references SIVOL_PERFIL (PEF_CODIGO)
      on delete restrict on update restrict;

alter table SIVOL_USUARIO
   add constraint FK_SIVOL_US_TIPO_USUA_SIVOL_TI foreign key (TIPUSU_CODIGO)
      references SIVOL_TIPO_USUARIO (TIPUSU_CODIGO)
      on delete restrict on update restrict;

alter table SIVOL_USUARIO
   add constraint FK_SIVOL_US_USUARIO_M_SIVOL_MA foreign key (MAEPER_CODIGO)
      references SIVOL_MAESTRO_PERSONA (MAEPER_CODIGO)
      on delete restrict on update restrict;

alter table SIVOL_VEHICULO
   add constraint FK_SIVOL_VE_ESTADO_VE_SIVOL_ES foreign key (ESTVEH_CODIGO)
      references SIVOL_ESTADO_VEHICULO (ESTVEH_CODIGO)
      on delete restrict on update restrict;

alter table SIVOL_VEHICULO
   add constraint FK_SIVOL_VE_MODELO_MA_SIVOL_MO foreign key (MODMAR_CODIGO)
      references SIVOL_MODELO_MARCA (MODMAR_CODIGO)
      on delete restrict on update restrict;

alter table SIVOL_VEHICULO
   add constraint FK_SIVOL_VE_OPERACION_SIVOL_OP foreign key (OPE_CODIGO)
      references SIVOL_OPERACION (OPE_CODIGO)
      on delete restrict on update restrict;

alter table SIVOL_VEHICULO
   add constraint FK_SIVOL_VE_PISO_BODE_SIVOL_PI foreign key (PISBOD_CODIGO)
      references SIVOL_PISO_BODEGA (PISBOD_CODIGO)
      on delete restrict on update restrict;

alter table SIVOL_VEHICULO
   add constraint FK_SIVOL_VE_RELATIONS_SIVOL_MA foreign key (MARVEH_CODIGO)
      references SIVOL_MARCA_VEHICULO (MARVEH_CODIGO)
      on delete restrict on update restrict;

alter table SIVOL_VEHICULO
   add constraint FK_SIVOL_VE_REMOLCADO_SIVOL_RE foreign key (REM_CODIGO)
      references SIVOL_REMOLCADOR (REM_CODIGO)
      on delete restrict on update restrict;

alter table SIVOL_VEHICULO
   add constraint FK_SIVOL_VE_TALLER_AF_SIVOL_TA foreign key (TALAFI_CODIGO)
      references SIVOL_TALLER_AFILIADO (TALAFI_CODIGO)
      on delete restrict on update restrict;

