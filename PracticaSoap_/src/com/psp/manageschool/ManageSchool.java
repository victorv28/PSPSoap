package com.psp.manageschool;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.3.5
 * 2020-03-02T02:33:01.446+01:00
 * Generated source version: 3.3.5
 *
 */
@WebService(targetNamespace = "http://www.example.org/manageSchool/", name = "manageSchool")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface ManageSchool {

    @WebMethod(operationName = "ManageSubject", action = "http://www.example.org/manageSchool/ManageAsignature")
    @WebResult(name = "SubjectResponse", targetNamespace = "http://www.example.org/manageSchool/", partName = "SubjectStatus")
    public SubjectResponse manageSubject(

        @WebParam(partName = "objSubject", name = "SubjectRequest", targetNamespace = "http://www.example.org/manageSchool/")
        SubjectRequest objSubject
    );

    @WebMethod(operationName = "ManageScoring", action = "http://www.example.org/manageSchool/ManageStudent")
    @WebResult(name = "ScoringResponse", targetNamespace = "http://www.example.org/manageSchool/", partName = "ScoringStatus")
    public ScoringResponse manageScoring(

        @WebParam(partName = "objScoring", name = "ScoringRequest", targetNamespace = "http://www.example.org/manageSchool/")
        ScoringRequest objScoring
    );

    @WebMethod(operationName = "ManageStudent", action = "http://www.example.org/manageSchool/ManageStudent")
    @WebResult(name = "StudentResponse", targetNamespace = "http://www.example.org/manageSchool/", partName = "StudentStatus")
    public StudentResponse manageStudent(

        @WebParam(partName = "objStudent", name = "StudentRequest", targetNamespace = "http://www.example.org/manageSchool/")
        StudentRequest objStudent
    );
}