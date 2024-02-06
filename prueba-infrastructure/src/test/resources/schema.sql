IF (OBJECT_ID('dbo.FK_tbl_puntos_venta_tbl_entidades', 'F') IS NOT NULL)
    ALTER TABLE dbo.tm_puntos_ventas DROP CONSTRAINT FK_tbl_puntos_venta_tbl_entidades
GO 

IF (OBJECT_ID('dbo.FK_tbl_ticket_detalles_tbl_tickets', 'F') IS NOT NULL)
    ALTER TABLE dbo.tga_solicitudes DROP CONSTRAINT FK_tbl_ticket_detalles_tbl_tickets
GO 

IF (OBJECT_ID('dbo.FK_tga_solicitudes_tm_puntos_ventas', 'F') IS NOT NULL)
    ALTER TABLE dbo.tga_solicitudes DROP CONSTRAINT FK_tga_solicitudes_tm_puntos_ventas
GO 
IF (OBJECT_ID('dbo.FK_tga_solicitudes_tus_personas', 'F') IS NOT NULL)
    ALTER TABLE dbo.tga_solicitudes DROP CONSTRAINT FK_tga_solicitudes_tus_personas
GO 
IF (OBJECT_ID('dbo.FK_tbl_trabajador_nuevo_tbl_ticket_detalles', 'F') IS NOT NULL)
    ALTER TABLE dbo.tga_solicitudes_personas DROP CONSTRAINT FK_tbl_trabajador_nuevo_tbl_ticket_detalles
GO 

IF (OBJECT_ID('dbo.FK_tus_personas_tusm_tipos_documentos', 'F') IS NOT NULL)
    ALTER TABLE dbo.tus_personas DROP CONSTRAINT FK_tus_personas_tusm_tipos_documentos
GO 

IF (OBJECT_ID('dbo.FK_tbl_rol_persona_tbl_personas', 'F') IS NOT NULL)
    ALTER TABLE dbo.tga_roles_personas DROP CONSTRAINT FK_tbl_rol_persona_tbl_personas
GO 

IF (OBJECT_ID('dbo.FK_tbl_rol_persona_tbl_puntos_venta', 'F') IS NOT NULL)
    ALTER TABLE dbo.tga_roles_personas DROP CONSTRAINT FK_tbl_rol_persona_tbl_puntos_venta
GO 


DROP TABLE IF EXISTS tusm_tipos_documentos
GO

CREATE TABLE [dbo].[tusm_tipos_documentos](
	[tipo_documento_id] [tinyint] IDENTITY(1,1) NOT NULL,
	[codigo] [varchar](5) NOT NULL,
	[nombre] [varchar](60) NOT NULL,
	[tipo_codificacion] [varchar](18) NULL,
	[caracteres_max] [tinyint] NOT NULL,
	[mascara] [varchar](40) NOT NULL,
	[orden] [tinyint] NOT NULL,
	[controlar_mascara] [bit] NOT NULL,
	[validacion_reniec] [bit] NOT NULL,
	[reg_exp] [varchar](100) NULL,
	[tipo] [tinyint] NULL,
	[longitud_exacta] [bit] NULL,
	[state] [bit] NOT NULL,
	[user_create] [int] NOT NULL,
	[created_at] [datetime] NOT NULL,
	[delete_at] [datetime] NULL,
	[user_update] [int] NULL,
	[update_at] [datetime] NULL,
	[user_delete] [int] NULL,
 CONSTRAINT [PK_tusm_tipos_documentos] PRIMARY KEY CLUSTERED 
(
	[tipo_documento_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO

DROP TABLE IF EXISTS tm_entidades
GO
CREATE TABLE [dbo].[tm_entidades](
	[entidad_id] [int] IDENTITY(1,1) NOT NULL,
	[codigo] [varchar](20) NOT NULL,
	[empresa_id] [smallint] NULL,
	[canal_comercial_id] [smallint] NULL,
	[nombre] [varchar](100) NOT NULL,
	[agencia_recaudacion_atis] [varchar](100) NULL,
	[state] [bit] NOT NULL,
	[user_create] [int] NOT NULL,
	[created_at] [datetime] NOT NULL,
	[delete_at] [datetime] NULL,
	[user_update] [int] NULL,
	[update_at] [datetime] NULL,
	[user_delete] [int] NULL,
	[codigo_jv] [varchar](10) NULL,
 CONSTRAINT [PK_tbl_entidades] PRIMARY KEY CLUSTERED 
(
	[entidad_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO

DROP TABLE IF EXISTS tm_puntos_ventas
GO
CREATE TABLE [dbo].[tm_puntos_ventas](
	[punto_venta_id] [int] IDENTITY(1,1) NOT NULL,
	[grupo_ad] [varchar](80) NULL,
	[codigo_agencia] [varchar](20) NULL,
	[codigo_atis] [varchar](20) NULL,
	[codigo] [varchar](20) NOT NULL,
	[entidad_id] [int] NOT NULL,
	[nombre] [varchar](100) NOT NULL,
	[direccion] [varchar](100) NULL,
	[codigo_franquicia] [varchar](4) NULL,
	[ubigeo_zc] [varchar](10) NULL,
	[ubigeo] [varchar](10) NULL,
	[state] [bit] NOT NULL,
	[user_create] [int] NOT NULL,
	[created_at] [datetime] NOT NULL,
	[delete_at] [datetime] NULL,
	[user_update] [int] NULL,
	[update_at] [datetime] NULL,
	[user_delete] [int] NULL,
	[codigo_zona] [varchar](50) NULL,
	[codigo_bodega] [varchar](50) NULL,
	[nombre_bodega] [varchar](100) NULL,
	[codigo_jv] [varchar](10) NULL,
 CONSTRAINT [PK_tbl_puntos_venta] PRIMARY KEY CLUSTERED 
(
	[punto_venta_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO

ALTER TABLE [dbo].[tm_puntos_ventas]  WITH CHECK ADD  CONSTRAINT [FK_tbl_puntos_venta_tbl_entidades] FOREIGN KEY([entidad_id])
REFERENCES [dbo].[tm_entidades] ([entidad_id])
GO

ALTER TABLE [dbo].[tm_puntos_ventas] CHECK CONSTRAINT [FK_tbl_puntos_venta_tbl_entidades]
GO

DROP TABLE IF EXISTS tus_personas
GO
CREATE TABLE [dbo].[tus_personas](
	[persona_id] [int] IDENTITY(1,1) NOT NULL,
	[tipo_documento_id] [tinyint] NOT NULL,
	[numero_doc] [varchar](20) NOT NULL,
	[nombres] [varchar](80) NOT NULL,
	[paterno] [varchar](80) NOT NULL,
	[materno] [varchar](80) NULL,
	[email] [varchar](200) NOT NULL,
	[telefono_fijo] [varchar](20) NULL,
	[telefono_celular] [varchar](20) NOT NULL,
	[autenticacion_biometrica] [bit] NOT NULL,
	[es_vendedor] [bit] NOT NULL,
	[persona_reniec_id] [int] NULL,
	[state] [bit] NOT NULL,
	[user_create] [int] NOT NULL,
	[created_at] [datetime] NOT NULL,
	[user_update] [int] NULL,
	[update_at] [datetime] NULL,
	[delete_at] [datetime] NULL,
	[user_delete] [int] NULL,
	[fecha_nacimiento] [date] NULL,
 CONSTRAINT [PK_tbl_personas] PRIMARY KEY CLUSTERED 
(
	[persona_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO

ALTER TABLE [dbo].[tus_personas] ADD  CONSTRAINT [tus_personas_activo]  DEFAULT ((1)) FOR [state]
GO

ALTER TABLE [dbo].[tus_personas] ADD  CONSTRAINT [tus_personas_creacion]  DEFAULT (sysdatetime()) FOR [created_at]
GO 


ALTER TABLE [dbo].[tus_personas]  WITH CHECK ADD  CONSTRAINT [FK_tus_personas_tusm_tipos_documentos] FOREIGN KEY([tipo_documento_id])
REFERENCES [dbo].[tusm_tipos_documentos] ([tipo_documento_id])
GO

ALTER TABLE [dbo].[tus_personas] CHECK CONSTRAINT [FK_tus_personas_tusm_tipos_documentos]
GO



DROP TABLE IF EXISTS tgr_tickets
GO

CREATE TABLE [tgr_tickets](
	[ticket_id] [int] IDENTITY(1,1) NOT NULL,
	[ticket_numero] [varchar](20) NOT NULL,
	[estado_ejecucion_tic_id] [tinyint] NOT NULL,
	[tipo_ticket_id] [tinyint] NOT NULL,
	[gestor_id] [int] NULL,
	[ejecucion_cn_id] [int] NULL,
	[fecha_aprobacion] [datetime] NULL,
	[fecha_cierre] [datetime] NULL,
	[cantidad_solicitudes] [smallint] NOT NULL,
	[tipo_solicitud_id] [tinyint] NOT NULL,
	[empresa_id] [smallint] NOT NULL,
	[state] [int] NOT NULL,
	[user_create] [int] NOT NULL,
	[created_at] [datetime] NOT NULL,
	[delete_at] [datetime] NULL,
	[user_update] [int] NULL,
	[update_at] [datetime] NULL,
	[user_delete] [int] NULL,
	[socio_id] [int] NOT NULL,
	[estado_ejecucion_id] [tinyint] NOT NULL,
	[notified] [bit] NULL,
	[canal_comercial_id] [smallint] NULL,
        CONSTRAINT [PK_tbl_tickets] PRIMARY KEY ([ticket_id] )
)
GO

DROP TABLE IF EXISTS tga_solicitudes
GO
CREATE TABLE [dbo].[tga_solicitudes](
	[solicitud_id] [int] IDENTITY(1,1) NOT NULL,
	[ticket_id] [int] NOT NULL,
	[estado_ejecucion_sol_id] [smallint] NOT NULL,
	[fecha_aprobacion] [datetime] NULL,
	[fecha_ejecucion] [datetime] NULL,
	[subticket_numero] [varchar](20) NOT NULL,
	[punto_venta_id] [int] NULL,
	[persona_id] [int] NULL,
	[rol_funcional_id] [smallint] NOT NULL,
	[fecha_cese] [datetime] NULL,
	[comentario] [varchar](510) NULL,
	[contrasena] [varchar](200) NULL,
	[aplicacion_id] [tinyint] NULL,
	[state] [bit] NOT NULL,
	[user_create] [int] NOT NULL,
	[created_at] [datetime] NOT NULL,
	[delete_at] [datetime] NULL,
	[user_update] [int] NULL,
	[update_at] [datetime] NULL,
	[user_delete] [int] NULL,
	[estado_ejecucion_id] [smallint] NOT NULL,
	[estado_reintento] [tinyint] NULL,
	[todas_sols_procesar] [text] NULL,
	[fecha_cierre] [datetime] NULL,
 CONSTRAINT [PK_tbl_ticket_detalles] PRIMARY KEY CLUSTERED 
(
	[solicitud_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO

ALTER TABLE [dbo].[tga_solicitudes] ADD  CONSTRAINT [tga_solicitudes_activo]  DEFAULT ((1)) FOR [state]
GO

ALTER TABLE [dbo].[tga_solicitudes] ADD  CONSTRAINT [tga_solicitudes_creacion]  DEFAULT (sysdatetime()) FOR [created_at]
GO

ALTER TABLE [dbo].[tga_solicitudes] ADD  CONSTRAINT [DF__tga_solic__estad__768259EC]  DEFAULT ((1)) FOR [estado_ejecucion_id]
GO

ALTER TABLE [dbo].[tga_solicitudes]  WITH CHECK ADD  CONSTRAINT [FK_tbl_ticket_detalles_tbl_tickets] FOREIGN KEY([ticket_id])
REFERENCES [dbo].[tgr_tickets] ([ticket_id])
GO

ALTER TABLE [dbo].[tga_solicitudes] CHECK CONSTRAINT [FK_tbl_ticket_detalles_tbl_tickets]
GO

ALTER TABLE [dbo].[tga_solicitudes]  WITH CHECK ADD  CONSTRAINT [FK_tga_solicitudes_tm_puntos_ventas] FOREIGN KEY([punto_venta_id])
REFERENCES [dbo].[tm_puntos_ventas] ([punto_venta_id])
GO

ALTER TABLE [dbo].[tga_solicitudes] CHECK CONSTRAINT [FK_tga_solicitudes_tm_puntos_ventas]
GO

ALTER TABLE [dbo].[tga_solicitudes]  WITH CHECK ADD  CONSTRAINT [FK_tga_solicitudes_tus_personas] FOREIGN KEY([persona_id])
REFERENCES [dbo].[tus_personas] ([persona_id])
GO

ALTER TABLE [dbo].[tga_solicitudes] CHECK CONSTRAINT [FK_tga_solicitudes_tus_personas]
GO


DROP TABLE IF EXISTS tga_solicitudes_personas
GO

CREATE TABLE [dbo].[tga_solicitudes_personas](
	[solicitud_id] [int] NOT NULL,
	[numero_doc] [varchar](20) NOT NULL,
	[nombres] [varchar](80) NOT NULL,
	[paterno] [varchar](80) NOT NULL,
	[materno] [varchar](80) NULL,
	[email] [varchar](200) NOT NULL,
	[telefono_fijo] [varchar](20) NULL,
	[telefono_celular] [varchar](20) NULL,
	[autenticacion_biometrica] [bit] NOT NULL,
	[es_vendedor] [bit] NULL,
	[state] [bit] NOT NULL,
	[user_create] [int] NOT NULL,
	[created_at] [datetime] NOT NULL,
	[delete_at] [datetime] NULL,
	[user_update] [int] NULL,
	[update_at] [datetime] NULL,
	[user_delete] [int] NULL,
	[tipo_documento_id] [tinyint] NOT NULL,
	[solicitud_persona_id] [int] IDENTITY(0,1) NOT NULL,
	[fecha_nacimiento] [date] NULL,
 CONSTRAINT [tga_solicitudes_personas_PK] PRIMARY KEY CLUSTERED 
(
	[solicitud_persona_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO

ALTER TABLE [dbo].[tga_solicitudes_personas] ADD  CONSTRAINT [tga_solicitud_personas_activo]  DEFAULT ((1)) FOR [state]
GO

ALTER TABLE [dbo].[tga_solicitudes_personas] ADD  CONSTRAINT [tga_solicitud_personas_creacion]  DEFAULT (sysdatetime()) FOR [created_at]
GO

ALTER TABLE [dbo].[tga_solicitudes_personas]  WITH NOCHECK ADD  CONSTRAINT [FK_tbl_trabajador_nuevo_tbl_ticket_detalles] FOREIGN KEY([solicitud_id])
REFERENCES [dbo].[tga_solicitudes] ([solicitud_id])
GO

ALTER TABLE [dbo].[tga_solicitudes_personas] CHECK CONSTRAINT [FK_tbl_trabajador_nuevo_tbl_ticket_detalles]
GO


DROP TABLE IF EXISTS tga_roles_personas
GO

CREATE TABLE [dbo].[tga_roles_personas](
	[rol_persona_id] [int] IDENTITY(1,1) NOT NULL,
	[persona_id] [int] NOT NULL,
	[rol_funcional_id] [smallint] NOT NULL,
	[punto_venta_id] [int] NOT NULL,
	[fecha_inicio] [date] NOT NULL,
	[solicitud_id_crea] [int] NULL,
	[solicitud_id_baja] [int] NULL,
	[state] [bit] NOT NULL,
	[user_create] [int] NOT NULL,
	[created_at] [datetime] NOT NULL,
	[delete_at] [datetime] NULL,
	[user_update] [int] NULL,
	[update_at] [datetime] NULL,
	[user_delete] [int] NULL,
	[rol_persona_id_anterior] [int] NULL,
 CONSTRAINT [PK_tbl_rol_persona] PRIMARY KEY CLUSTERED 
(
	[rol_persona_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO

ALTER TABLE [dbo].[tga_roles_personas] ADD  CONSTRAINT [tga_rol_persona_activo]  DEFAULT ((1)) FOR [state]
GO

ALTER TABLE [dbo].[tga_roles_personas] ADD  CONSTRAINT [tga_rol_persona_creacion]  DEFAULT (sysdatetime()) FOR [created_at]
GO

ALTER TABLE [dbo].[tga_roles_personas]  WITH CHECK ADD  CONSTRAINT [FK_tbl_rol_persona_tbl_personas] FOREIGN KEY([persona_id])
REFERENCES [dbo].[tus_personas] ([persona_id])
GO

ALTER TABLE [dbo].[tga_roles_personas] CHECK CONSTRAINT [FK_tbl_rol_persona_tbl_personas]
GO

ALTER TABLE [dbo].[tga_roles_personas]  WITH CHECK ADD  CONSTRAINT [FK_tbl_rol_persona_tbl_puntos_venta] FOREIGN KEY([punto_venta_id])
REFERENCES [dbo].[tm_puntos_ventas] ([punto_venta_id])
GO

ALTER TABLE [dbo].[tga_roles_personas] CHECK CONSTRAINT [FK_tbl_rol_persona_tbl_puntos_venta]
GO


DROP TABLE IF EXISTS tsg_usuarios
GO

CREATE TABLE [dbo].[tsg_usuarios](
	[usuario_id] [int] IDENTITY(1,1) NOT NULL,
	[persona_id] [int] NULL,
	[punto_venta_id] [int] NULL,
	[nombre] [varchar](40) NOT NULL,
	[perfil_id] [smallint] NULL,
	[contrasena] [varchar](60) NULL,
	[cambia_contrasena] [bit] NOT NULL,
	[intentos] [tinyint] NULL,
	[bloqueado] [bit] NOT NULL,
	[bloqueo_all_app] [tinyint] NULL,
	[ip_usuario_creacion] [varchar](40) NULL,
	[ip_usuario_actualiza] [varchar](40) NULL,
	[ip_usuario_elimina] [varchar](40) NULL,
	[fecha_vigencia] [datetime] NULL,
	[fecha_ultima_contrasena] [datetime] NULL,
	[bloqueo_id] [int] NULL,
	[state] [bit] NOT NULL,
	[user_create] [int] NOT NULL,
	[created_at] [datetime] NOT NULL,
	[delete_at] [datetime] NULL,
	[user_update] [int] NULL,
	[update_at] [datetime] NULL,
	[user_delete] [int] NULL,
	[fecha_bloqueo_intentos] [datetime] NULL,
	[usuario_servicio] [bit] NULL,
	[validar_totp_login] [bit] NULL,
	[secreto_totp] [varchar](50) NULL,
	[fecha_creacion_otp_ms] [int] NULL,
	[fecha_ultimo_login] [datetime] NULL,
 CONSTRAINT [PK_tbl_siam_usuarios] PRIMARY KEY CLUSTERED 
(
	[usuario_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO

ALTER TABLE [dbo].[tsg_usuarios] ADD  CONSTRAINT [tsg_usuarios_activo]  DEFAULT ((1)) FOR [state]
GO

ALTER TABLE [dbo].[tsg_usuarios] ADD  CONSTRAINT [tsg_usuarios_creacion]  DEFAULT (sysdatetime()) FOR [created_at]
GO


DROP TABLE IF EXISTS tga_muerte_informatica_haross
GO

create table tga_muerte_informatica_haross(
    muerte_id int not null IDENTITY PRIMARY KEY,
	documento_usuario varchar(20) not null ,
	tipo_documento varchar(20) not null ,
	codigo_accion varchar(10) not null ,
	nro_ticket_haross varchar(20) not null ,
	usuario_solic varchar(20) not null ,
	solicitud_id int  null,
	codigo_respuesta varchar(3) not null,
	descrip_respuesta varchar(150) not null,
	detalle_respuesta text null
)
GO
 