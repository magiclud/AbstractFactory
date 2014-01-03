package eu.jpereira.trainings.designpatterns.creational.abstractfactory;

public interface ReportFactory {

	ReportBody createReportBody();

	ReportFooter createReportFooter();

	ReportHeader createReportHeader();

}
