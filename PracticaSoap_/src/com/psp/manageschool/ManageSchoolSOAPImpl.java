
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.psp.manageschool;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.3.5
 * 2020-03-02T02:33:01.402+01:00
 * Generated source version: 3.3.5
 *
 */

@javax.jws.WebService(
                      serviceName = "manageSchool",
                      portName = "manageSchoolSOAP",
                      targetNamespace = "http://www.example.org/manageSchool/",
                      wsdlLocation = "file:/C:/Users/victor/eclipse-workspace/PracticaSoap_/WebContent/WSDL/manageSchool.wsdl",
                      endpointInterface = "com.psp.manageschool.ManageSchool")

public class ManageSchoolSOAPImpl implements ManageSchool {

    private static final Logger LOG = Logger.getLogger(ManageSchoolSOAPImpl.class.getName());

    /* (non-Javadoc)
     * @see com.psp.manageschool.ManageSchool#manageSubject(com.psp.manageschool.SubjectRequest objSubject)*
     */
    public com.psp.manageschool.SubjectResponse manageSubject(SubjectRequest objSubject) {
        LOG.info("Executing operation manageSubject");
        System.out.println(objSubject);
        try {
            com.psp.manageschool.SubjectResponse _return = new com.psp.manageschool.SubjectResponse();
            _return.setValidation(true);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.psp.manageschool.ManageSchool#manageScoring(com.psp.manageschool.ScoringRequest objScoring)*
     */
    public com.psp.manageschool.ScoringResponse manageScoring(ScoringRequest objScoring) {
        LOG.info("Executing operation manageScoring");
        System.out.println(objScoring);
        try {
            com.psp.manageschool.ScoringResponse _return = new com.psp.manageschool.ScoringResponse();
            _return.setValidation(true);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.psp.manageschool.ManageSchool#manageStudent(com.psp.manageschool.StudentRequest objStudent)*
     */
    public com.psp.manageschool.StudentResponse manageStudent(StudentRequest objStudent) {
        LOG.info("Executing operation manageStudent");
        System.out.println(objStudent);
        try {
            com.psp.manageschool.StudentResponse _return = new com.psp.manageschool.StudentResponse();
            _return.setValidation(true);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}