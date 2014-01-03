package eu.jpereira.trainings.designpatterns.creational.abstractfactory.json;

import eu.jpereira.trainings.designpatterns.creational.abstractfactory.ReportBody;
import eu.jpereira.trainings.designpatterns.creational.abstractfactory.ReportFactory;
import eu.jpereira.trainings.designpatterns.creational.abstractfactory.ReportFooter;
import eu.jpereira.trainings.designpatterns.creational.abstractfactory.ReportHeader;

public class JSONReportFactory implements ReportFactory {

	ReportFooter footer = null;
	ReportHeader header = null;
	ReportBody body = null;

	@Override
	public ReportBody createReportBody() {

		body = new JSONReportBody();
		body.getType();
		return body;


	}

	@Override
	public ReportFooter createReportFooter() {
		footer = new JSONReportFooter();
		footer.getType();
		return footer;
	}

	@Override
	public ReportHeader createReportHeader() {
		header = new JSONReportHeader();
		header.getType();
		return header;
	}

}
