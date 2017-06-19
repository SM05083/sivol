CREATE TABLE public.sivol_alerta (
	ale_codigo int4 NOT NULL,
	maeper_codigo int4 NOT NULL,
	tipale_codigo int4 NOT NULL,
	ale_nombre bpchar(150) NULL,
	ale_descripcion bpchar(500) NULL,
	ale_fecha_creacion date NULL,
	ale_fecha_modificacion date NULL,
	CONSTRAINT pk_sivol_alerta PRIMARY KEY (ale_codigo),
	CONSTRAINT fk_sivol_al_maestro_p_sivol_ma FOREIGN KEY (maeper_codigo) REFERENCES public.sivol_maestro_persona(maeper_codigo) ON DELETE RESTRICT ON UPDATE RESTRICT,
	CONSTRAINT fk_sivol_al_tipo_aler_sivol_ti FOREIGN KEY (tipale_codigo) REFERENCES public.sivol_tipo_alerta(tipale_codigo) ON DELETE RESTRICT ON UPDATE RESTRICT
)
WITH (
	OIDS=FALSE
) ;
CREATE INDEX maestro_persona_alerta_fk ON public.sivol_alerta (maeper_codigo DESC) ;
CREATE UNIQUE INDEX sivol_alerta_pk ON public.sivol_alerta (ale_codigo DESC) ;
CREATE INDEX tipo_alerta_alerta_fk ON public.sivol_alerta (tipale_codigo DESC) ;

CREATE TABLE public.sivol_bodega (
	bod_codigo bpchar(4) NOT NULL,
	bod_nombre bpchar(150) NULL,
	bod_fecha_creacion date NULL,
	bod_fecha_modificacion date NULL,
	bod_tarifa_dia numeric(15,2) NULL,
	bod_direccion bpchar(500) NULL,
	CONSTRAINT pk_sivol_bodega PRIMARY KEY (bod_codigo)
)
WITH (
	OIDS=FALSE
) ;
CREATE UNIQUE INDEX sivol_bodega_pk ON public.sivol_bodega (bod_codigo DESC) ;

CREATE TABLE public.sivol_desperfecto_vehiculo (
	desveh_codigo int4 NOT NULL,
	veh_codigo int4 NOT NULL,
	tipestrep_codigo int4 NOT NULL,
	desveh_descripcion bpchar(500) NULL,
	desveh_fecha_creacion date NULL,
	desveh_fecha_modificacion date NULL,
	desveh_costo numeric(15,2) NULL,
	CONSTRAINT pk_sivol_desperfecto_vehiculo PRIMARY KEY (desveh_codigo),
	CONSTRAINT fk_sivol_de_tipo_esta_sivol_ti FOREIGN KEY (tipestrep_codigo) REFERENCES public.sivol_tipo_estado_reparacion(tipestrep_codigo) ON DELETE RESTRICT ON UPDATE RESTRICT,
	CONSTRAINT fk_sivol_de_vehiculo__sivol_ve FOREIGN KEY (veh_codigo) REFERENCES public.sivol_vehiculo(veh_codigo) ON DELETE RESTRICT ON UPDATE RESTRICT
)
WITH (
	OIDS=FALSE
) ;
CREATE UNIQUE INDEX sivol_desperfecto_vehiculo_pk ON public.sivol_desperfecto_vehiculo (desveh_codigo DESC) ;
CREATE INDEX tipo_estado_rep_desp_veh_fk ON public.sivol_desperfecto_vehiculo (tipestrep_codigo DESC) ;
CREATE INDEX vehiculo_desp_vehiculo_fk ON public.sivol_desperfecto_vehiculo (veh_codigo DESC) ;

CREATE TABLE public.sivol_estado_vehiculo (
	estveh_codigo int4 NOT NULL,
	estveh_nombre bpchar(150) NULL,
	estveh_descripcion bpchar(500) NULL,
	estveh_fecha_creacion date NULL,
	estveh_fecha_modificacion date NULL,
	CONSTRAINT pk_sivol_estado_vehiculo PRIMARY KEY (estveh_codigo)
)
WITH (
	OIDS=FALSE
) ;
CREATE UNIQUE INDEX sivol_estado_vehiculo_pk ON public.sivol_estado_vehiculo (estveh_codigo DESC) ;

CREATE TABLE public.sivol_maestro_persona (
	maeper_codigo int4 NOT NULL,
	maeper_nombre bpchar(100) NULL,
	maeper_apellido bpchar(100) NULL,
	maeper_apellido_casada bpchar(100) NULL,
	maeper_genero bpchar(1) NULL,
	maeper_fecha_nacimiento date NULL,
	maeper_direccion bpchar(256) NULL,
	maeper_tel_movil int4 NULL,
	maeper_tel_casa int4 NULL,
	maeper_correo bpchar(50) NULL,
	maeper_nit bpchar(14) NULL,
	maeper_conteo_vehiculos int4 NULL,
	CONSTRAINT pk_sivol_maestro_persona PRIMARY KEY (maeper_codigo)
)
WITH (
	OIDS=FALSE
) ;
CREATE UNIQUE INDEX sivol_maestro_persona_pk ON public.sivol_maestro_persona (maeper_codigo DESC) ;

CREATE TABLE public.sivol_marca_vehiculo (
	marveh_codigo bpchar(3) NOT NULL,
	marveh_nombre bpchar(150) NULL,
	marveh_fecha_creacion date NULL,
	marveh_fecha_modificaion date NULL,
	CONSTRAINT pk_sivol_marca_vehiculo PRIMARY KEY (marveh_codigo)
)
WITH (
	OIDS=FALSE
) ;
CREATE UNIQUE INDEX sivol_marca_vehiculo_pk ON public.sivol_marca_vehiculo (marveh_codigo DESC) ;

CREATE TABLE public.sivol_menu_item (
	menite_codigo int4 NOT NULL,
	menite_nombre bpchar(150) NULL,
	menite_descripcion bpchar(500) NULL,
	menite_url bpchar(256) NULL,
	menite_fecha_creacion date NULL,
	menite_fecha_modificacion date NULL,
	CONSTRAINT pk_sivol_menu_item PRIMARY KEY (menite_codigo)
)
WITH (
	OIDS=FALSE
) ;
CREATE UNIQUE INDEX sivol_menu_item_pk ON public.sivol_menu_item (menite_codigo DESC) ;

CREATE TABLE public.sivol_modelo_marca (
	modmar_codigo int4 NOT NULL,
	marveh_codigo bpchar(3) NOT NULL,
	modmar_nombre bpchar(150) NULL,
	modmar_fecha_creacion date NULL,
	modmar_fecha_modificacion date NULL,
	CONSTRAINT pk_sivol_modelo_marca PRIMARY KEY (modmar_codigo),
	CONSTRAINT fk_sivol_mo_marca_veh_sivol_ma FOREIGN KEY (marveh_codigo) REFERENCES public.sivol_marca_vehiculo(marveh_codigo) ON DELETE RESTRICT ON UPDATE RESTRICT
)
WITH (
	OIDS=FALSE
) ;
CREATE INDEX marca_vehiculo_modelo_marca_fk ON public.sivol_modelo_marca (marveh_codigo DESC) ;
CREATE UNIQUE INDEX sivol_modelo_marca_pk ON public.sivol_modelo_marca (modmar_codigo DESC) ;

CREATE TABLE public.sivol_multimedia_vehiculo (
	mulveh_codigo int4 NOT NULL,
	veh_codigo int4 NOT NULL,
	tipmul_codigo int4 NOT NULL,
	mulveh_titulo bpchar(150) NULL,
	mulveh_url bpchar(256) NULL,
	mulveh_fecha_creacion date NULL,
	mulveh_fecha_modificacion date NULL,
	CONSTRAINT pk_sivol_multimedia_vehiculo PRIMARY KEY (mulveh_codigo),
	CONSTRAINT fk_sivol_mu_tipo_mult_sivol_ti FOREIGN KEY (tipmul_codigo) REFERENCES public.sivol_tipo_multimedia(tipmul_codigo) ON DELETE RESTRICT ON UPDATE RESTRICT,
	CONSTRAINT fk_sivol_mu_vehiculo__sivol_ve FOREIGN KEY (veh_codigo) REFERENCES public.sivol_vehiculo(veh_codigo) ON DELETE RESTRICT ON UPDATE RESTRICT
)
WITH (
	OIDS=FALSE
) ;
CREATE UNIQUE INDEX sivol_multimedia_vehiculo_pk ON public.sivol_multimedia_vehiculo (mulveh_codigo DESC) ;
CREATE INDEX tipo_mul_mul_veh_fk ON public.sivol_multimedia_vehiculo (tipmul_codigo DESC) ;
CREATE INDEX vehiculo_galeria_vehiculo_fk ON public.sivol_multimedia_vehiculo (veh_codigo DESC) ;

CREATE TABLE public.sivol_operacion (
	ope_codigo int4 NOT NULL,
	tipope_codigo int4 NOT NULL,
	maeper_codigo int4 NOT NULL,
	ope_descripcion bpchar(500) NULL,
	ope_fecha_creacion date NULL,
	ope_fecha_modificacion date NULL,
	ope_cod_autoriza int4 NULL,
	CONSTRAINT pk_sivol_operacion PRIMARY KEY (ope_codigo),
	CONSTRAINT fk_sivol_op_maestro_p_sivol_ma FOREIGN KEY (maeper_codigo) REFERENCES public.sivol_maestro_persona(maeper_codigo) ON DELETE RESTRICT ON UPDATE RESTRICT,
	CONSTRAINT fk_sivol_op_tipo_oper_sivol_ti FOREIGN KEY (tipope_codigo) REFERENCES public.sivol_tipo_operacion(tipope_codigo) ON DELETE RESTRICT ON UPDATE RESTRICT
)
WITH (
	OIDS=FALSE
) ;
CREATE INDEX maestro_persona_operacion_fk ON public.sivol_operacion (maeper_codigo DESC) ;
CREATE UNIQUE INDEX sivol_operacion_pk ON public.sivol_operacion (ope_codigo DESC) ;
CREATE INDEX tipo_operacion_operacion_fk ON public.sivol_operacion (tipope_codigo DESC) ;

CREATE TABLE public.sivol_param_grales (
	pargra_codigo_empresa int4 NOT NULL,
	pargra_nombre_empresa bpchar(256) NULL,
	pargra_logo_empresa bpchar(1) NULL,
	pargra_imgs_x_vehiculo int4 NULL,
	pargra_antigu_permitida int4 NULL,
	pargra_veh_permitidos int4 NULL,
	CONSTRAINT pk_sivol_param_grales PRIMARY KEY (pargra_codigo_empresa)
)
WITH (
	OIDS=FALSE
) ;
CREATE UNIQUE INDEX sivol_param_grales_pk ON public.sivol_param_grales (pargra_codigo_empresa DESC) ;

CREATE TABLE public.sivol_perfil (
	pef_codigo int4 NOT NULL,
	pef_nombre bpchar(150) NULL,
	pef_descripcion bpchar(500) NULL,
	pef_fecha_creacion date NULL,
	pef_fecha_modificacion date NULL,
	CONSTRAINT pk_sivol_perfil PRIMARY KEY (pef_codigo)
)
WITH (
	OIDS=FALSE
) ;
CREATE UNIQUE INDEX sivol_perfil_pk ON public.sivol_perfil (pef_codigo DESC) ;

CREATE TABLE public.sivol_permiso (
	per_codigo int4 NOT NULL,
	per_estado bpchar(1) NULL,
	menite_codigo int4 NULL,
	pef_codigo int4 NULL,
	CONSTRAINT pk_sivol_permiso PRIMARY KEY (per_codigo)
)
WITH (
	OIDS=FALSE
) ;
CREATE UNIQUE INDEX sivol_permiso_pk ON public.sivol_permiso (per_codigo DESC) ;

CREATE TABLE public.sivol_piso_bodega (
	pisbod_codigo int4 NOT NULL,
	bod_codigo bpchar(4) NOT NULL,
	pisbod_capacidad int4 NULL,
	pisbod_total_vehiculo int4 NULL,
	pisbod_costo_alquiler numeric(15,2) NULL,
	CONSTRAINT pk_sivol_piso_bodega PRIMARY KEY (pisbod_codigo),
	CONSTRAINT fk_sivol_pi_bodega_pi_sivol_bo FOREIGN KEY (bod_codigo) REFERENCES public.sivol_bodega(bod_codigo) ON DELETE RESTRICT ON UPDATE RESTRICT
)
WITH (
	OIDS=FALSE
) ;
CREATE INDEX bodega_piso_bodega_fk ON public.sivol_piso_bodega (bod_codigo DESC) ;
CREATE UNIQUE INDEX sivol_piso_bodega_pk ON public.sivol_piso_bodega (pisbod_codigo DESC) ;

CREATE TABLE public.sivol_remolcador (
	rem_codigo int4 NOT NULL,
	rem_descripcion bpchar(500) NULL,
	rem_capacidad int4 NULL,
	rem_fecha_creacion date NULL,
	rem_fecha_modificacion date NULL,
	CONSTRAINT pk_sivol_remolcador PRIMARY KEY (rem_codigo)
)
WITH (
	OIDS=FALSE
) ;
CREATE UNIQUE INDEX sivol_remolcador_pk ON public.sivol_remolcador (rem_codigo DESC) ;

CREATE TABLE public.sivol_taller_afiliado (
	talafi_codigo int4 NOT NULL,
	talafi_nombre bpchar(150) NULL,
	talafi_estado bpchar(1) NULL,
	talafi_contacto bpchar(150) NULL,
	talafi_direccion bpchar(500) NULL,
	talafi_telefono int4 NULL,
	CONSTRAINT pk_sivol_taller_afiliado PRIMARY KEY (talafi_codigo)
)
WITH (
	OIDS=FALSE
) ;
CREATE UNIQUE INDEX sivol_taller_afiliado_pk ON public.sivol_taller_afiliado (talafi_codigo DESC) ;

CREATE TABLE public.sivol_tipo_alerta (
	tipale_codigo int4 NOT NULL,
	tipale_nombre bpchar(150) NULL,
	tipale_descripcion bpchar(500) NULL,
	tipale_fecha_creacion date NULL,
	tipale_fecha_modificacion date NULL,
	tipale_estado bpchar(1) NULL,
	CONSTRAINT pk_sivol_tipo_alerta PRIMARY KEY (tipale_codigo)
)
WITH (
	OIDS=FALSE
) ;
CREATE UNIQUE INDEX sivol_tipo_alerta_pk ON public.sivol_tipo_alerta (tipale_codigo DESC) ;

CREATE TABLE public.sivol_tipo_estado_reparacion (
	tipestrep_codigo int4 NOT NULL,
	tipestrep_nombre bpchar(150) NULL,
	tipestrep_descripcion bpchar(500) NULL,
	tipestrep_fecha_creacion date NULL,
	tipestrep_fecha_modificacion date NULL,
	CONSTRAINT pk_sivol_tipo_estado_reparacio PRIMARY KEY (tipestrep_codigo)
)
WITH (
	OIDS=FALSE
) ;
CREATE UNIQUE INDEX sivol_tipo_estado_reparacion_pk ON public.sivol_tipo_estado_reparacion (tipestrep_codigo DESC) ;

CREATE TABLE public.sivol_tipo_multimedia (
	tipmul_codigo int4 NOT NULL,
	tipmul_descripcion bpchar(500) NULL,
	tipmul_extensiones bpchar(4) NULL,
	tipmul_fecha_creacion date NULL,
	tipmul_fecha_modificacion date NULL,
	CONSTRAINT pk_sivol_tipo_multimedia PRIMARY KEY (tipmul_codigo)
)
WITH (
	OIDS=FALSE
) ;
CREATE UNIQUE INDEX sivol_tipo_multimedia_pk ON public.sivol_tipo_multimedia (tipmul_codigo DESC) ;

CREATE TABLE public.sivol_tipo_operacion (
	tipope_codigo int4 NOT NULL,
	tipope_descripcion bpchar(500) NULL,
	tipope_nombre bpchar(150) NULL,
	tipope_fecha_creacion date NULL,
	tipope_fecha_modificacion date NULL,
	CONSTRAINT pk_sivol_tipo_operacion PRIMARY KEY (tipope_codigo)
)
WITH (
	OIDS=FALSE
) ;
CREATE UNIQUE INDEX sivol_tipo_operacion_pk ON public.sivol_tipo_operacion (tipope_codigo DESC) ;

CREATE TABLE public.sivol_tipo_usuario (
	tipusu_codigo int4 NOT NULL,
	pef_codigo int4 NOT NULL,
	tipusu_descripcion bpchar(150) NULL,
	tipusu_fecha_creacion date NULL,
	tipusu_fecha_modif date NULL,
	CONSTRAINT pk_sivol_tipo_usuario PRIMARY KEY (tipusu_codigo),
	CONSTRAINT fk_sivol_ti_perfil_ti_sivol_pe FOREIGN KEY (pef_codigo) REFERENCES public.sivol_perfil(pef_codigo) ON DELETE RESTRICT ON UPDATE RESTRICT
)
WITH (
	OIDS=FALSE
) ;
CREATE INDEX perfil_tipo_usuario_fk ON public.sivol_tipo_usuario (pef_codigo DESC) ;
CREATE UNIQUE INDEX sivol_tipo_usuario_pk ON public.sivol_tipo_usuario (tipusu_codigo DESC) ;

CREATE TABLE public.sivol_usuario (
	usu_usuario bpchar(10) NOT NULL,
	tipusu_codigo int4 NOT NULL,
	usu_codigo int4 NOT NULL,
	usu_estado int4 NULL,
	usu_tipo int4 NULL,
	usu_contrasena bpchar(64) NULL,
	usu_fecha_creacion date NULL,
	usu_fecha_modificacion date NULL,
	CONSTRAINT pk_sivol_usuario PRIMARY KEY (usu_usuario),
	CONSTRAINT fk_sivol_us_tipo_usua_sivol_ti FOREIGN KEY (tipusu_codigo) REFERENCES public.sivol_tipo_usuario(tipusu_codigo) ON DELETE RESTRICT ON UPDATE RESTRICT
)
WITH (
	OIDS=FALSE
) ;
CREATE UNIQUE INDEX sivol_usuario_pk ON public.sivol_usuario (usu_usuario DESC) ;
CREATE INDEX tipo_usuario_usuario_fk ON public.sivol_usuario (tipusu_codigo DESC) ;
CREATE INDEX usuario_maestro_persona_fk ON public.sivol_usuario (usu_codigo DESC) ;

CREATE TABLE public.sivol_vehiculo (
	veh_codigo int4 NOT NULL,
	pisbod_codigo int4 NOT NULL,
	rem_codigo int4 NOT NULL,
	talafi_codigo int4 NOT NULL,
	estveh_codigo int4 NOT NULL,
	ope_codigo int4 NOT NULL,
	marveh_codigo bpchar(3) NULL,
	modmar_codigo int4 NOT NULL,
	veh_anio int4 NULL,
	veh_ubicacion bpchar(12) NULL,
	veh_porc_avance numeric(5,2) NULL,
	veh_fecha_impor date NULL,
	veh_fecha_modificacion date NULL,
	veh_costo numeric(15,2) NULL,
	veh_descripcion bpchar(500) NULL,
	veh_costo_alquiler numeric(15,2) NULL,
	CONSTRAINT pk_sivol_vehiculo PRIMARY KEY (veh_codigo),
	CONSTRAINT fk_sivol_ve_estado_ve_sivol_es FOREIGN KEY (estveh_codigo) REFERENCES public.sivol_estado_vehiculo(estveh_codigo) ON DELETE RESTRICT ON UPDATE RESTRICT,
	CONSTRAINT fk_sivol_ve_modelo_ma_sivol_mo FOREIGN KEY (modmar_codigo) REFERENCES public.sivol_modelo_marca(modmar_codigo) ON DELETE RESTRICT ON UPDATE RESTRICT,
	CONSTRAINT fk_sivol_ve_operacion_sivol_op FOREIGN KEY (ope_codigo) REFERENCES public.sivol_operacion(ope_codigo) ON DELETE RESTRICT ON UPDATE RESTRICT,
	CONSTRAINT fk_sivol_ve_piso_bode_sivol_pi FOREIGN KEY (pisbod_codigo) REFERENCES public.sivol_piso_bodega(pisbod_codigo) ON DELETE RESTRICT ON UPDATE RESTRICT,
	CONSTRAINT fk_sivol_ve_relations_sivol_ma FOREIGN KEY (marveh_codigo) REFERENCES public.sivol_marca_vehiculo(marveh_codigo) ON DELETE RESTRICT ON UPDATE RESTRICT,
	CONSTRAINT fk_sivol_ve_remolcado_sivol_re FOREIGN KEY (rem_codigo) REFERENCES public.sivol_remolcador(rem_codigo) ON DELETE RESTRICT ON UPDATE RESTRICT,
	CONSTRAINT fk_sivol_ve_taller_af_sivol_ta FOREIGN KEY (talafi_codigo) REFERENCES public.sivol_taller_afiliado(talafi_codigo) ON DELETE RESTRICT ON UPDATE RESTRICT
)
WITH (
	OIDS=FALSE
) ;
CREATE INDEX estado_vehiculo_vehiculo_fk ON public.sivol_vehiculo (estveh_codigo DESC) ;
CREATE INDEX modelo_marca_vehiculo_fk ON public.sivol_vehiculo (modmar_codigo DESC) ;
CREATE INDEX operacion_vehiculo_fk ON public.sivol_vehiculo (ope_codigo DESC) ;
CREATE INDEX piso_bodega_vehiculo_fk ON public.sivol_vehiculo (pisbod_codigo DESC) ;
CREATE INDEX relationship_19_fk ON public.sivol_vehiculo (marveh_codigo DESC) ;
CREATE INDEX remolcador_vehiculo_fk ON public.sivol_vehiculo (rem_codigo DESC) ;
CREATE UNIQUE INDEX sivol_vehiculo_pk ON public.sivol_vehiculo (veh_codigo DESC) ;
CREATE INDEX taller_afiliado_vehiculo_fk ON public.sivol_vehiculo (talafi_codigo DESC) ;
