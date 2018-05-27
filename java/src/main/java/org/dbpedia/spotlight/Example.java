package org.dbpedia.spotlight;


import org.dbpedia.spotlight.common.AnnotationUnit;
import org.dbpedia.spotlight.rest.Spotlight;

import java.net.URL;

public class Example {

    public static void main(String args[]) throws Exception {


        Spotlight spotlight = new Spotlight();
        AnnotationUnit annotationUnit;


        // By TEXT

        String text = "Berlin is the capital of Germany";

        annotationUnit = spotlight.get(text);
        print(annotationUnit);


        // By URL

        URL url = new URL("https://en.wikipedia.org/wiki/Germany");

        annotationUnit = spotlight.get(url);
        print(annotationUnit);
    }

    private static void print(AnnotationUnit annotationUnit) {

        if (annotationUnit != null) {
            annotationUnit.getResources().stream().forEach(r -> System.out.println(r.getUri()));
        }
    }
}
