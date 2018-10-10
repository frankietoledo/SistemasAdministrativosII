
/*mayorean en caja y bancos 110*/
INSERT INTO cuentasSimples (nombre,tipo, monto, codigoCS, recibeSaldo, idMayor)
VALUES ("Activo", "Activo", 0,100,0, 0);


/*mayorean en caja y bancos 110*/
INSERT INTO cuentasSimples (nombre,tipo, monto, codigoCS, recibeSaldo, idMayor)
VALUES ("Caja y Bancos", "Activo", 0,110,0, 0);
/*mayorean en caja y bancos 110*/
INSERT INTO cuentasSimples (nombre,tipo, monto, codigoCS, recibeSaldo, idMayor)
VALUES ("Caja", "Activo", 0,111,1, 110);

INSERT INTO cuentasSimples (nombre,tipo, monto, codigoCS, recibeSaldo, idMayor)
VALUES ("Banco plazo fijo", "Activo", 0,112,1,110);

INSERT INTO cuentasSimples (nombre,tipo, monto, codigoCS, recibeSaldo, idMayor)
VALUES ("Banco c/c", "Activo", 0,113, 1, 110);
/*mayorean en creditos 120*/
INSERT INTO cuentasSimples (nombre,tipo, monto, codigoCS, recibeSaldo, idMayor)
VALUES ("Deudores por ventas", "Activo", 0,121, 1,120);

INSERT INTO cuentasSimples (nombre,tipo, monto, codigoCS, recibeSaldo, idMayor)
VALUES ("Documentos a cobrar", "Activo", 0,122,1,120); 

INSERT INTO cuentasSimples (nombre,tipo, monto, codigoCS, recibeSaldo, idMayor)
VALUES ("Valores a depositar", "Activo", 0,123, 1, 120);


INSERT INTO cuentasSimples (nombre,tipo, monto, codigoCS, recibeSaldo, idMayor)
VALUES ("Bienes de cambio", "Activo", 0,130, 0, 0);
/*mayorean en Bienes de cambio 130*/
INSERT INTO cuentasSimples (nombre,tipo, monto, codigoCS, recibeSaldo, idMayor)
VALUES ("Mercaderias", "Activo", 0,131, 1, 130);

INSERT INTO cuentasSimples (nombre,tipo, monto, codigoCS, recibeSaldo, idMayor)
VALUES ("Bienes de Uso", "Activo", 0,140, 0, 0);
/*mayorean en Bienes de uso 140*/
INSERT INTO cuentasSimples (nombre,tipo, monto, codigoCS, recibeSaldo, idMayor)
VALUES ("Inmuebles", "Activo", 0,141,1,140);
INSERT INTO cuentasSimples (nombre,tipo, monto, codigoCS, recibeSaldo, idMayor)
VALUES ("Rodados", "Activo", 0,142,1,140);
INSERT INTO cuentasSimples (nombre,tipo, monto, codigoCS, recibeSaldo, idMayor)
VALUES ("Instalaciones", "Activo", 0,143,1,140);


/*arrancan los pasivos*/
INSERT INTO cuentasSimples (nombre,tipo, monto, codigoCS, recibeSaldo, idMayor)
VALUES ("Pasivo", "Pasivo", 0,200, 0, 0);

INSERT INTO cuentasSimples (nombre,tipo, monto, codigoCS, recibeSaldo, idMayor)
VALUES ("Deudas Comerciales", "Pasivo", 0,210, 0, 0);
/*moyorean en Deudas Comerciales 210*/

INSERT INTO cuentasSimples (nombre,tipo, monto, codigoCS, recibeSaldo, idMayor)
VALUES ("Proveedores", "Pasivo", 0,211,1,210);
INSERT INTO cuentasSimples (nombre,tipo, monto, codigoCS, recibeSaldo, idMayor)
VALUES ("Sueldos a pagar", "Pasivo", 0,212,1,210);

INSERT INTO cuentasSimples (nombre,tipo, monto, codigoCS, recibeSaldo, idMayor)
VALUES ("Deudas Fiscales", "Pasivo", 0,220, 0, 0);
/*mayorean en Deudas fiscales 220*/
INSERT INTO cuentasSimples (nombre,tipo, monto, codigoCS, recibeSaldo, idMayor)
VALUES ("Impuestos a pagar", "Pasivo", 0,221,1,220);
INSERT INTO cuentasSimples (nombre,tipo, monto, codigoCS, recibeSaldo, idMayor)
VALUES ("Moratorias", "Pasivo", 0,222,1,220);


INSERT INTO cuentasSimples (nombre,tipo, monto, codigoCS, recibeSaldo, idMayor)
VALUES ("Prestamos Bancarios", "Pasivo", 0,231,1,0);

/*Patrimonio*/
INSERT INTO cuentasSimples (nombre,tipo, monto, codigoCS, recibeSaldo, idMayor)
VALUES ("Patrimonio", "Patrimonio Neto", 0,300,0,0);

/*mayorean en patrimonio*/
INSERT INTO cuentasSimples (nombre,tipo, monto, codigoCS, recibeSaldo, idMayor)
VALUES ("Capital", "Patrimonio Neto", 0,301,1,300);
INSERT INTO cuentasSimples (nombre,tipo, monto, codigoCS, recibeSaldo, idMayor)
VALUES ("Resultados", "Patrimonio Neto", 0,302,1,300);


/*otros ingresos*/
INSERT INTO cuentasSimples (nombre,tipo,monto, codigoCS, recibeSaldo, idMayor)
VALUES ("Ingresos", "Resultado Positivo", 0,400,0,0);
/*mayorea en ventas 410*/
INSERT INTO cuentasSimples (nombre,tipo, monto, codigoCS, recibeSaldo, idMayor)
VALUES ("Ventas", "Resultado Positivo", 0,411,1,0);

/*cuanta otros ingresos*/
INSERT INTO cuentasSimples (nombre,tipo,monto, codigoCS, recibeSaldo, idMayor)
VALUES ("Otros Ingresos", "Resultado Positivo", 0,420,0,0);

INSERT INTO cuentasSimples (nombre,tipo, monto, codigoCS, recibeSaldo, idMayor)
VALUES ("Intereses ganados", "Resultado Positivo", 0,421,1,420);

/*egresos cuenta de mayor*/
INSERT INTO cuentasSimples (nombre,tipo,monto, codigoCS, recibeSaldo, idMayor)
VALUES ("Egresos", "Resultado Negativo", 0,500,0,0);

/*mayorean en egresos*/
INSERT INTO cuentasSimples (nombre,tipo, monto, codigoCS, recibeSaldo, idMayor)
VALUES ("Costo mercaderia vendida", "Resultado Negativo", 0,501,1,500);
INSERT INTO cuentasSimples (nombre,tipo, monto, codigoCS, recibeSaldo, idMayor)
VALUES ("Impuestos", "Resultado Negativo", 0,502,1,500);
INSERT INTO cuentasSimples (nombre,tipo, monto, codigoCS, recibeSaldo, idMayor)
VALUES ("Sueldos", "Resultado Negativo", 0,503,1,500);
INSERT INTO cuentasSimples (nombre,tipo, monto, codigoCS, recibeSaldo, idMayor)
VALUES ("Itereses", "Resultado Negativo", 0,504,1,500);
INSERT INTO cuentasSimples (nombre,tipo, monto, codigoCS, recibeSaldo, idMayor)
VALUES ("Alquileres", "Resultado Negativo", 0,505,1,500);



