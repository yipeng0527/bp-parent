create table public.merchant (
	id varchar(36) not null primary key default uuid_generate_v4(),
	name varchar(50),
  address varchar(1024),
	created_by varchar(100) DEFAULT user,
	created_date timestamp(0) not null DEFAULT now(),
	updated_by varchar(100) not null DEFAULT user,
	updated_date timestamp(0) not null DEFAULT now()
);
COMMENT ON TABLE public.merchant IS '商户表';
COMMENT ON COLUMN public.merchant.id is '主键';
COMMENT ON COLUMN public.merchant.name is '商户名称';
COMMENT ON COLUMN public.merchant.address is '商户地址';
COMMENT ON COLUMN public.merchant.created_by is '创建人';
COMMENT ON COLUMN public.merchant.created_date is '创建时间';
COMMENT ON COLUMN public.merchant.updated_by is '更新人';
COMMENT ON COLUMN public.merchant.updated_date is '更新时间';

CREATE INDEX idx_merchant_name ON public.merchant(name);

--grant select on public.pos_finance_accept to r_posdata_qry;
--grant select,update,insert,delete on public.pos_finance_accept to r_posdata_dml;