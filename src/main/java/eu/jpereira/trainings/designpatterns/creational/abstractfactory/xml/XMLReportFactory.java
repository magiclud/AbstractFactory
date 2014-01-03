package eu.jpereira.trainings.designpatterns.creational.abstractfactory.xml;

import eu.jpereira.trainings.designpatterns.creational.abstractfactory.ReportBody;
import eu.jpereira.trainings.designpatterns.creational.abstractfactory.ReportFactory;
import eu.jpereira.trainings.designpatterns.creational.abstractfactory.ReportFooter;
import eu.jpereira.trainings.designpatterns.creational.abstractfactory.ReportHeader;

public class XMLReportFactory implements ReportFactory {

	ReportFooter footer = null;
	ReportHeader header = null;
	ReportBody body = null;

	@Override
	public ReportBody createReportBody() {
		body = new XMLReportBody();
		body.getType();
		return body;

	}

	@Override
	public ReportFooter createReportFooter() {
		footer = new XMLReportFooter();
		footer.getType();
		return footer;
	}

	@Override
	public ReportHeader createReportHeader() {
		header = new XMLReportHeader();
		header.getType();
		return header;
	}

}
