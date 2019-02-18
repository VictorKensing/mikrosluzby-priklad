# mikrosluzby-priklad
Mikrosluzby - priklad

mikrosluzby pre umyvaren aut
- vozidlo, zakaznik, ukon, ponuka - posledne dve zatial nie su
- spring boot 2.1.3
- dokumentacia - swagger - pre zakaznikov ui, alebo json subor
- netflix eureka naming server: eureka-naming-server port 8761 - http://localhost:8761/ - sluzby sa prihlasuju na tento server
- netlix zuul api gateway: zuul-api-gateway-server port 8765 - sluzby cez api - autentifikacia, autorizacia, bezpecnost, agregacia sluzieb atd. - riesim len volanie sluzby
- databaza - v pamati h2


Spustenie aplikacii:
1) EurekaNamingServerApplication
2) ZuulApiGatewayServerApplication
3) VozidloSluzbaApplication
4) ZakaznikSluzbaApplication

- kontrola registrovanych aplikacii v eureka http://localhost:8761/ 

RESTFULL services

1) vozidlo: vozidlo-sluzba port 8100
- databaza h2 konzola: http://localhost:8100/h2-console
- dokumentacia swagger: http://localhost:8100/swagger-ui.html   http://localhost:8100/v2/api-docs
- najdi vsetky vozidla: http://localhost:8100/vozidla
- najdi vsetky vozidla cez zuul: http://localhost:8765/vozidlo-sluzba/vozidla
- najdi vozidlo podla ecv: http://localhost:8100/vozidla/{ecv} priklad http://localhost:8100/vozidla/AA111AA
- najdi vozidlo podla ecv cez zuul: http://localhost:8765/vozidlo-sluzba/vozidla/{ecv} priklad http://localhost:8765/vozidlo-sluzba/vozidla/AA111AA
- pridaj vozidlo json post: localhost:8100/vozidla

2) zakaznik: zakaznik-sluzba port 8000
- databaza h2 konzola: http://localhost:8000/h2-console
- dokumentacia swagger: http://localhost:8000/swagger-ui.html   http://localhost:8000/v2/api-docs
- najdi vsetkych zakaznikov: http://localhost:8000/zakaznici
- najdi vsetkych zakaznikov cez zuul: http://localhost:8765/zakaznik-sluzba/zakaznici
- najdi zakaznika podla id:http://localhost:8000/zakaznici/{id} priklad http://localhost:8000/zakaznici/20001
- najdi zakaznika podla id cez zuul:http://localhost:8765/zakaznik-sluzba/zakaznici/{id} priklad http://localhost:8765/zakaznik-sluzba/zakaznici/20001




