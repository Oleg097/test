package com.mg.clientmg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.transport.http.HttpsUrlConnectionMessageSender;

import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.TrustManagerFactory;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;

@Configuration
public class GetTransferConfig {


    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.mg.mgclient");
        return marshaller;
    }

    @Bean
    public GetTransferClient countryClient(Jaxb2Marshaller marshaller) throws IOException, KeyStoreException, CertificateException, NoSuchAlgorithmException, UnrecoverableKeyException {
        GetTransferClient client = new GetTransferClient();
        client.setDefaultUri("https://tsws.sb.com.ua/swws/swws.asmx");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);

        InputStream inputStream = null;
        KeyStore ts = null;
        KeyManagerFactory keyManagerFactory = null;
        try {
            ts = KeyStore.getInstance("JKS");
            inputStream = this.getClass().getClassLoader().getResourceAsStream("truststore.jks");
            ts.load(inputStream, "changeit".toCharArray());
            keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
            keyManagerFactory.init(ts, "changeit".toCharArray());
        } catch (NoSuchAlgorithmException | CertificateException | KeyStoreException | IOException
                | UnrecoverableKeyException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

            InputStream inputStream2 = null;
            KeyStore ts2 = null;
            TrustManagerFactory trustManagerFactory = null;
            try {
                ts = KeyStore.getInstance("JKS");
                inputStream = this.getClass().getClassLoader().getResourceAsStream("certificate.jks");
                ts.load(inputStream, "changeit".toCharArray());
                trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init(ts);
            } catch (NoSuchAlgorithmException | CertificateException | KeyStoreException | IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


        HttpsUrlConnectionMessageSender messageSender = new HttpsUrlConnectionMessageSender();
        messageSender.setKeyManagers(keyManagerFactory.getKeyManagers());
        messageSender.setTrustManagers(trustManagerFactory.getTrustManagers());

        client.setMessageSender(messageSender);


        return client;
    }
}
