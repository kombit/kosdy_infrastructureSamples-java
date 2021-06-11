package dk.kombit.samples.utils;

import dk.kombit.xml.schemas.requestheader._1.RequestHeaderType;
import dk.serviceplatformen.xml.schemas.serviceplatformfault._1.ServiceplatformFault;
import org.slf4j.Logger;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Holder;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.UUID;

public final class SoapUtils {

    public static Holder<RequestHeaderType> getRequestHeader() {
        RequestHeaderType requestHeaderType = new RequestHeaderType();
        requestHeaderType.setTransactionUUID(UUID.randomUUID().toString());

        return new Holder<>(requestHeaderType);
    }

    public static void logError(ServiceplatformFault fault, Logger logger) {
        fault.getFaultInfo()
             .getErrorList()
             .getError()
             .forEach(errorType -> logger.error(
                     "Error code: {}\nError text: {}\n",
                     errorType.getErrorCode(),
                     errorType.getErrorText()
             ));
        logger.error("Unable to complete program. See error(s) above");
    }

    /**
     * Methods responsible for splitting a String into individual ints
     * It is used to turn the dates and times from client.properties
     * into ints that is put into an XmlCalender object
     *
     * @param date
     * @return xmlCalender
     */
    public static XMLGregorianCalendar getXmlCalender(String date) {
        var xmlCalendar = getXmlCalender();
        String[] part = date.split(",");
        xmlCalendar.setYear(Integer.parseInt(part[0]));
        xmlCalendar.setMonth(Integer.parseInt(part[1]));
        xmlCalendar.setDay(Integer.parseInt(part[2]));
        xmlCalendar.setTime(Integer.parseInt(part[3]), Integer.parseInt(part[4]), Integer.parseInt(part[5]), Integer.parseInt(part[6]));

        return xmlCalendar;
    }

    /**
     * Gets "Europe/Copenhagen" timezone and puts it into a XmlCalender object
     * which is used in the method above
     *
     * @return new calender instance with timezone
     */
    public static XMLGregorianCalendar getXmlCalender() {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeZone(TimeZone.getTimeZone("Europe/Copenhagen"));
        return DatatypeFactory.newDefaultInstance().newXMLGregorianCalendar(calendar);
    }
}
