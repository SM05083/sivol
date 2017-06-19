INSERT INTO public.sivol_alerta
(ale_codigo, maeper_codigo, tipale_codigo, ale_nombre, ale_descripcion, ale_fecha_creacion, ale_fecha_modificacion)
VALUES(0, 0, 0, '', '', '', '');
INSERT INTO public.sivol_bodega
(bod_codigo, bod_nombre, bod_fecha_creacion, bod_fecha_modificacion, bod_tarifa_dia, bod_direccion)
VALUES('', '', '', '', 0, '');
INSERT INTO public.sivol_desperfecto_vehiculo
(desveh_codigo, veh_codigo, tipestrep_codigo, desveh_descripcion, desveh_fecha_creacion, desveh_fecha_modificacion, desveh_costo)
VALUES(0, 0, 0, '', '', '', 0);
INSERT INTO public.sivol_estado_vehiculo
(estveh_codigo, estveh_nombre, estveh_descripcion, estveh_fecha_creacion, estveh_fecha_modificacion)
VALUES(0, '', '', '', '');
INSERT INTO public.sivol_maestro_persona
(maeper_codigo, maeper_nombre, maeper_apellido, maeper_apellido_casada, maeper_genero, maeper_fecha_nacimiento, maeper_direccion, maeper_tel_movil, maeper_tel_casa, maeper_correo, maeper_nit, maeper_conteo_vehiculos)
VALUES(0, '', '', '', '', '', '', 0, 0, '', '', 0);
INSERT INTO public.sivol_marca_vehiculo
(marveh_codigo, marveh_nombre, marveh_fecha_creacion, marveh_fecha_modificaion)
VALUES('', '', '', '');
INSERT INTO public.sivol_menu_item
(menite_codigo, menite_nombre, menite_descripcion, menite_url, menite_fecha_creacion, menite_fecha_modificacion)
VALUES(0, '', '', '', '', '');
INSERT INTO public.sivol_modelo_marca
(modmar_codigo, marveh_codigo, modmar_nombre, modmar_fecha_creacion, modmar_fecha_modificacion)
VALUES(0, '', '', '', '');
INSERT INTO public.sivol_multimedia_vehiculo
(mulveh_codigo, veh_codigo, tipmul_codigo, mulveh_titulo, mulveh_url, mulveh_fecha_creacion, mulveh_fecha_modificacion)
VALUES(0, 0, 0, '', '', '', '');
INSERT INTO public.sivol_operacion
(ope_codigo, tipope_codigo, maeper_codigo, ope_descripcion, ope_fecha_creacion, ope_fecha_modificacion, ope_cod_autoriza)
VALUES(0, 0, 0, '', '', '', 0);
INSERT INTO public.sivol_param_grales
(pargra_codigo_empresa, pargra_nombre_empresa, pargra_logo_empresa, pargra_imgs_x_vehiculo, pargra_antigu_permitida, pargra_veh_permitidos)
VALUES(0, '', '', 0, 0, 0);
INSERT INTO public.sivol_perfil
(pef_codigo, pef_nombre, pef_descripcion, pef_fecha_creacion, pef_fecha_modificacion)
VALUES(0, '', '', '', '');
INSERT INTO public.sivol_permiso
(per_codigo, per_estado, menite_codigo, pef_codigo)
VALUES(0, '', 0, 0);
INSERT INTO public.sivol_piso_bodega
(pisbod_codigo, bod_codigo, pisbod_capacidad, pisbod_total_vehiculo, pisbod_costo_alquiler)
VALUES(0, '', 0, 0, 0);
INSERT INTO public.sivol_remolcador
(rem_codigo, rem_descripcion, rem_capacidad, rem_fecha_creacion, rem_fecha_modificacion)
VALUES(0, '', 0, '', '');
INSERT INTO public.sivol_taller_afiliado
(talafi_codigo, talafi_nombre, talafi_estado, talafi_contacto, talafi_direccion, talafi_telefono)
VALUES(0, '', '', '', '', 0);
INSERT INTO public.sivol_tipo_alerta
(tipale_codigo, tipale_nombre, tipale_descripcion, tipale_fecha_creacion, tipale_fecha_modificacion, tipale_estado)
VALUES(0, '', '', '', '', '');
INSERT INTO public.sivol_tipo_estado_reparacion
(tipestrep_codigo, tipestrep_nombre, tipestrep_descripcion, tipestrep_fecha_creacion, tipestrep_fecha_modificacion)
VALUES(0, '', '', '', '');
INSERT INTO public.sivol_tipo_multimedia
(tipmul_codigo, tipmul_descripcion, tipmul_extensiones, tipmul_fecha_creacion, tipmul_fecha_modificacion)
VALUES(0, '', '', '', '');
INSERT INTO public.sivol_tipo_operacion
(tipope_codigo, tipope_descripcion, tipope_nombre, tipope_fecha_creacion, tipope_fecha_modificacion)
VALUES(0, '', '', '', '');
INSERT INTO public.sivol_tipo_usuario
(tipusu_codigo, pef_codigo, tipusu_descripcion, tipusu_fecha_creacion, tipusu_fecha_modif)
VALUES(0, 0, '', '', '');
INSERT INTO public.sivol_usuario
(usu_usuario, tipusu_codigo, usu_codigo, usu_estado, usu_tipo, usu_contrasena, usu_fecha_creacion, usu_fecha_modificacion)
VALUES('', 0, 0, 0, 0, '', '', '');
INSERT INTO public.sivol_vehiculo
(veh_codigo, pisbod_codigo, rem_codigo, talafi_codigo, estveh_codigo, ope_codigo, marveh_codigo, modmar_codigo, veh_anio, veh_ubicacion, veh_porc_avance, veh_fecha_impor, veh_fecha_modificacion, veh_costo, veh_descripcion, veh_costo_alquiler)
VALUES(0, 0, 0, 0, 0, 0, '', 0, 0, '', 0, '', '', 0, '', 0);
