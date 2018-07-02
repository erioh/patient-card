package ua.clinic.patient.card.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.xdocreport.XDocReportView;

@Configuration
public class DefaultConfiguration {

    @Bean(name = "docxReport")
    public XDocReportView getXDocReportView() {
        XDocReportView xDocReportView = new XDocReportView();
        xDocReportView.setUrl("classpath:template.docx");
        xDocReportView.setTemplateEngineId("Velocity");
        return xDocReportView;
    }

    @Bean
    public ModelMapper getModelMapper() {
        return new ModelMapper();
    }
}
