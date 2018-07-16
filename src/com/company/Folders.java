package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class Folders {

    public static Collection<String> folderNames(String xml, char startingLetter) throws ParserConfigurationException, IOException, SAXException {

        Collection<String> folderNames = new ArrayList<>();

        DocumentBuilder db = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        InputSource is = new InputSource();
        is.setCharacterStream(new StringReader(xml));

        Document doc = db.parse(is);
        NodeList nodes = doc.getElementsByTagName("folder");


        for (int i = 0; i < nodes.getLength(); i++) {
            Element element = (Element) nodes.item(i);
            String name = element.getAttribute("name").toLowerCase();

            if(name.charAt(0) == 'u'){
                folderNames.add(name);
            }
        }

        return folderNames;
    }


    public static void main(String[] args) throws Exception {
        String xml =
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                        "<folder name=\"c\">" +
                            "<folder name=\"program files\">" +
                                "<folder name=\"uninstall information\" />" +
                            "</folder>" +
                            "<folder name=\"users\" />" +
                            "<folder name=\"program files\">" +
                                "<folder name=\"Un-all\" />" +
                                "<folder name=\"unTo\" />" +
                                "<folder name=\"unSome\" />" +
                                "<folder name=\"program files\">" +
                                    "<folder name=\"unD\" />" +
                                    "<folder name=\"uNNE\" />" +
                                    "<folder name=\"under\" />" +
                                    "<folder name=\"Untill-Now\">" +
                                    "</folder>" +
                                "</folder>" +
                            "</folder>" +
                            "<folder name=\"use\" />" +
                        "</folder>";


        Collection<String> names = folderNames(xml, 'u');
        for(String name: names)
            System.out.println(name);
    }
}
