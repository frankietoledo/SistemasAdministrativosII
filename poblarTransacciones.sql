
/*Sueldos a pagar*/
insert into transacciones (idCuenta, valor, esDebe, idAsiento)
values (18,30,0, 2);
insert into transacciones (idCuenta, valor, esDebe, idAsiento)
values (18,15,1, 3);
insert into transacciones (idCuenta, valor, esDebe, idAsiento)
values (18,45,1, 3);


insert into transacciones (idCuenta, valor, esDebe, idAsiento)
values (2,60,0, 3);
insert into transacciones (idCuenta, valor, esDebe, idAsiento)
values (2,45,1, 4);


select * from cuentasSimples inner join transacciones on (cuentasSimples.idCuenta = transacciones.idcuenta);

select * from cuentasSimples natural join (asientos natural join transacciones) where cuentasSimples.codigoCS = ?;
