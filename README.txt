jZarinpal is a java library for communicating with Zarinpal.com web service.

The idea is to use REST for simplifying some common scenarios.
for example for receiving new authority code, you could use following form:

<form action="http://127.0.0.1:9998/paymentrequest" method="post">
 <input name="amount">1000</input>
 <input name="description">Charge account</input>
 <input name="callbackURL">http://127.0.0.1:9998/receiveAuthority</input>
</form>

and you only receive authority code if success.
and you have HTML status code for finding the cause of failure.


One module of this application is serving RESTful resources(jzarinpal-server)
and the other will using these RESTful resources(jzarinpal-client).

Usually jzarinpal-server need to be installed in one of your servers,
then jzarinpal-client could be used in any of your java applications.


NOTE NOTE: If you want to use Zarinpal.com web service only once in one application,
           then using Web Service code directly sounds simpler(to me).

Ideally (one day) creators of Zarinpal.com
will provide this RESTful service for us! :-)


p.s. https://github.com/SamaGostar/Zarinpal-Gateway-Documentation was only
     founded document(written in Farsi language) that I used for reference.
     If this document is out-of-date or there is better one?
     please let me know, thank you.
