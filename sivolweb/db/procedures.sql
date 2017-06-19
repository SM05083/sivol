CREATE OR REPLACE FUNCTION public.actualiza_fecha_tipo_usuario()
 RETURNS trigger
 LANGUAGE plpgsql
AS $function$
begin
	update sivol_tipo_usuario set tipusu_fecha_creacion = now(),
	tipusu_fecha_modif = now() where tipusu_codigo=NEW.tipusu_codigo;
	return new;
end;
$function$;

CREATE OR REPLACE FUNCTION public.actualizar_fecha_perfil()
 RETURNS trigger
 LANGUAGE plpgsql
AS $function$
begin
	UPDATE sivol_perfil 
	SET pef_fecha_creacion=now(), pef_fecha_modificacion=now()
	WHERE pef_codigo=NEW.pef_codigo;
	return new;
end;

$function$;

CREATE OR REPLACE FUNCTION public.actualizar_fecha_usuario()
 RETURNS trigger
 LANGUAGE plpgsql
AS $function$
begin
	update sivol_usuario
	set usu_fecha_creacion = now(), usu_fecha_modificacion = now()
	where usu_usuario = NEW.usu_usuario;
	return new;
end;

$function$;

CREATE OR REPLACE FUNCTION public.actualizar_menu_fecha()
 RETURNS trigger
 LANGUAGE plpgsql
AS $function$
begin 
	update sivol_menu_item set  
	menite_fecha_modificacion = now() where menite_codigo = NEW.menite_codigo;
	return new;
end 
$function$;

CREATE OR REPLACE FUNCTION public.crear_menu_fecha()
 RETURNS trigger
 LANGUAGE plpgsql
AS $function$
begin 
	update sivol_menu_item set menite_fecha_creacion = now(), 
	menite_fecha_modificacion = now() where menite_codigo = NEW.menite_codigo;
	return new;
end 
$function$;

CREATE OR REPLACE FUNCTION public.crear_persona_vacia()
 RETURNS trigger
 LANGUAGE plpgsql
AS $function$
begin
	insert into sivol_maestro_persona
	(maeper_codigo) values(new.usu_codigo);
	return new;
end;

$function$;
