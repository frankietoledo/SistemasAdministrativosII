/* sqlite no usa aautoincrement, usa rowid, un codigo unico para identificar la fila dentro de la tabla. lo que puedo hacer es crear un alias para el rowid: */
/* no tiene un tipo date, pero la funcion date maneja el text en formato yyyy-mm-dd hh:mm:ss.sss*/
CREATE TABLE asientos (
    idAsiento      INTEGER PRIMARY KEY ASC,
    fecha          TEXT    NOT NULL 
    
);


CREATE TABLE transacciones (
	idTransaccion	INTEGER PRIMARY KEY ASC, /*esto seria un alias*/
	cuenta		INTEGER NOT NULL,
	monto		FLOAT   NOT NULL,
	esDebe		BOOL    NOT NULL,
	idAsiento	INTEGER NOT NULL,

	CONSTRAINT cuenta_fk FOREIGN KEY (cuenta) REFERENCES cuentasSimples(idCuenta) ON UPDATE CASCADE ON DELETE CASCADE,
	CONSTRAINT idAsiento_fk FOREIGN KEY (idAsiento) REFERENCES asientos(idAsiento) ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE cuentasSimples (
	idCuenta	INTEGER PRIMARY KEY ASC,
	nombre		VARCHAR  NOT NULL,
	tipo		VARCHAR(2)  NOT NULL, /*si es activo pasivo r+ o r-*/
    	monto		FLOAT NOT NULL,
	codigoCS	INT NOT NULL UNIQUE,
	recibeSaldo	BOOL NOT NULL,
	idMayor		INTEGER NOT NULL DEFAULT 0,
	CONSTRAINT idMayor_fk FOREIGN KEY (idMayor) REFERENCES cuentasSimples(idSimple) ON UPDATE CASCADE ON DELETE CASCADE
);



