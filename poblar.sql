INSERT INTO asientos(fecha)
VALUES ("2018/10/08");

INSERT INTO transacciones (cuenta, monto, esDebe, idAsiento)
VALUES (1,200,1,2);


/*mayorean en caja y bancos 110*/
INSERT INTO cuentasSimples (nombre,tipo, monto, codigoCS)
VALUES ("Caja", "ac", 0,111);

INSERT INTO cuentasSimples (nombre,tipo, monto, codigoCS)
VALUES ("Banco plazo fijo", "ac", 0,112);

INSERT INTO cuentasSimples (nombre,tipo, monto, codigoCS)
VALUES ("Banco c/c", "ac", 0,113);
/*mayorean en creditos 120*/
INSERT INTO cuentasSimples (nombre,tipo, monto, codigoCS)
VALUES ("Deudores por ventas", "ac", 0,121);

INSERT INTO cuentasSimples (nombre,tipo, monto, codigoCS)
VALUES ("Documentos a cobrar", "ac", 0,122); 

INSERT INTO cuentasSimples (nombre,tipo, monto, codigoCS)
VALUES ("Valores a depositar", "ac", 0,123);

/*mayorean en Bienes de cambio 130*/
INSERT INTO cuentasSimples (nombre,tipo, monto, codigoCS)
VALUES ("Mercaderias", "ac", 0,131);
/*mayorean en Bienes de uso 140*/
INSERT INTO cuentasSimples (nombre,tipo, monto, codigoCS)
VALUES ("Inmuebles", "ac", 0,141);
INSERT INTO cuentasSimples (nombre,tipo, monto, codigoCS)
VALUES ("Rodados", "ac", 0,142);
INSERT INTO cuentasSimples (nombre,tipo, monto, codigoCS)
VALUES ("Instalaciones", "ac", 0,143);


/*arrancan los pasivos*/
/*moyorean en Deudas Comerciales 210*/
INSERT INTO cuentasSimples (nombre,tipo, monto, codigoCS)
VALUES ("Proveedores", "pa", 0,211);
INSERT INTO cuentasSimples (nombre,tipo, monto, codigoCS)
VALUES ("Sueldos a pagar", "pa", 0,212);
/*mayorean en Deudas fiscales 220*/
INSERT INTO cuentasSimples (nombre,tipo, monto, codigoCS)
VALUES ("Impuestos a pagar", "pa", 0,221);
INSERT INTO cuentasSimples (nombre,tipo, monto, codigoCS)
VALUES ("Moratorias", "pa", 0,222);

/*mayorean en nada, esta sola*/
INSERT INTO cuentasSimples (nombre,tipo, monto, codigoCS)
VALUES ("Prestamos Bancarios", "pa", 0,230);

/*Patrimonio*/
INSERT INTO cuentasSimples (nombre,tipo, monto, codigoCS)
VALUES ("Patrimonio", "pm", 0,300);
/*mayorean en ..*/
INSERT INTO cuentasSimples (nombre,tipo, monto, codigoCS)
VALUES ("Capital", "pm", 0,310);
INSERT INTO cuentasSimples (nombre,tipo, monto, codigoCS)
VALUES ("Resultados", "pm", 0,320);


/*otros ingresos*/
INSERT INTO cuentasSimples (nombre,tipo, monto, codigoCS)
VALUES ("Ingresos", "r+", 0,400);
/*mayorea en ventas 410*/
INSERT INTO cuentasSimples (nombre,tipo, monto, codigoCS)
VALUES ("Ventas", "r+", 0,411);

INSERT INTO cuentasSimples (nombre,tipo, monto, codigoCS)
VALUES ("Intereses ganados", "r+", 0,430);

/*mayorean en egresos*/
INSERT INTO cuentasSimples (nombre,tipo, monto, codigoCS)
VALUES ("Costo mercaderia vendida", "r-", 0,510);
INSERT INTO cuentasSimples (nombre,tipo, monto, codigoCS)
VALUES ("Impuestos", "r-", 0,520);
INSERT INTO cuentasSimples (nombre,tipo, monto, codigoCS)
VALUES ("Sueldos", "r-", 0,530);
INSERT INTO cuentasSimples (nombre,tipo, monto, codigoCS)
VALUES ("Itereses", "r-", 0,540);
INSERT INTO cuentasSimples (nombre,tipo, monto, codigoCS)
VALUES ("Alquileres", "r-", 0,550);



