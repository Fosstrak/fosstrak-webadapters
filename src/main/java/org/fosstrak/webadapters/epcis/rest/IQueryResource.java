/*
 * Copyright (C) 2010 ETH Zurich
 *
 * This file is part of Fosstrak (www.fosstrak.org) and
 * was developed as part of the webofthings.com initiative.
 *
 * Fosstrak is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License version 2.1, as published by the Free Software Foundation.
 *
 * Fosstrak is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with Fosstrak; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin Street, Fifth Floor,
 * Boston, MA  02110-1301  USA
 */
package org.fosstrak.webadapters.epcis.rest;


import org.fosstrak.webadapters.epcis.model.EPCISResource;
import javax.ws.rs.core.UriInfo;

/**
 * Interface for the query logic
 *
 * @author Mathias Mueller mathias.mueller(at)unifr.ch, <a href="http://www.guinard.org">Dominique Guinard</a>
 *
 *
 */
public interface IQueryResource {

    /**
     * Returns a representation of the selected read points resource returning all available read points according to the requested mime type
     *
     *
     * @param context
     *
     * @return an instance of org.epcis.fosstrak.restadapter.model.EPCISResource
     */
    public EPCISResource getAllReadPoints(UriInfo context);

    /**
     * Returns a representation of the business locations resource according to the requested mime type
     *
     *
     * @param context
     *
     * @return an instance of org.epcis.fosstrak.restadapter.model.EPCISResource
     */
    public EPCISResource getBusinessLocations(UriInfo context);

    /**
     * Returns a representation of the selected business location resource according to the requested mime type
     *
     *
     * @param context
     * @param businessLocation
     *
     * @return an instance of org.epcis.fosstrak.restadapter.model.EPCISResource
     */
    public EPCISResource getSelectedBusinessLocation(UriInfo context, String businessLocation);

    /**
     * Returns a representation of the read points resource according to the requested mime type
     *
     *
     * @param context
     * @param businessLocation
     *
     * @return an instance of org.epcis.fosstrak.restadapter.model.EPCISResource
     */
    public EPCISResource getReadPoints(UriInfo context, String businessLocation);

    /**
     * Returns a representation of the selected read point resource according to the requested mime type
     *
     *
     * @param context
     * @param businessLocation
     * @param readPoint
     *
     * @return an instance of org.epcis.fosstrak.restadapter.model.EPCISResource
     */
    public EPCISResource getSelectedReadPoint(UriInfo context, String businessLocation, String readPoint);

    /**
     * Returns a representation of the event times resource according to the requested mime type
     *
     *
     * @param context
     * @param businessLocation
     * @param readPoint
     *
     * @return an instance of org.epcis.fosstrak.restadapter.model.EPCISResource
     */
    public EPCISResource getEventTimes(UriInfo context, String businessLocation, String readPoint);

    /**
     * Returns a representation of the selected event time resource according to the requested mime type
     *
     *
     * @param context
     * @param businessLocation
     * @param readPoint
     * @param eventTime
     *
     * @return an instance of org.epcis.fosstrak.restadapter.model.EPCISResource
     */
    public EPCISResource getSelectedEventTime(UriInfo context, String businessLocation, String readPoint, String eventTime);

    /**
     * Returns a representation of the event resource according to the requested mime type
     *
     *
     * @param context
     * @param businessLocation
     * @param readPoint
     * @param eventTime
     * @param index
     *
     * @return an instance of org.epcis.fosstrak.restadapter.model.EPCISResource
     */
    public EPCISResource getEvent(UriInfo context, String businessLocation, String readPoint, String eventTime, String index);

    /**
     * Returns a representation of the event's record time resource according to the requested mime type
     *
     *
     * @param context
     * @param businessLocation
     * @param readPoint
     * @param eventTime
     * @param index
     *
     * @return an instance of org.epcis.fosstrak.restadapter.model.EPCISResource
     */
    public EPCISResource getRecordTime(UriInfo context, String businessLocation, String readPoint, String eventTime, String index);

    /**
     * Returns a representation of the event's time zone offset resource according to the requested mime type
     *
     * @param context
     * @param businessLocation
     * @param readPoint
     * @param eventTime
     * @param index
     * @return an instance of org.epcis.fosstrak.restadapter.model.EPCISResource
     */
    public EPCISResource getTimeZoneOffset(UriInfo context, String businessLocation, String readPoint, String eventTime, String index);

    /**
     * Returns a representation of the event's business step resource according to the requested mime type
     *
     *
     * @param context
     * @param businessLocation
     * @param readPoint
     * @param eventTime
     * @param index
     *
     * @return an instance of org.epcis.fosstrak.restadapter.model.EPCISResource
     */
    public EPCISResource getBusinessStep(UriInfo context, String businessLocation, String readPoint, String eventTime, String index);

    /**
     * Returns a representation of the event's action resource according to the requested mime type
     *
     *
     * @param context
     * @param businessLocation
     * @param readPoint
     * @param eventTime
     * @param index
     *
     * @return an instance of org.epcis.fosstrak.restadapter.model.EPCISResource
     */
    public EPCISResource getAction(UriInfo context, String businessLocation, String readPoint, String eventTime, String index);

    /**
     * Returns a representation of the event's event time resource according to the requested mime type
     *
     *
     * @param context
     * @param businessLocation
     * @param readPoint
     * @param eventTime
     * @param index
     *
     * @return an instance of org.epcis.fosstrak.restadapter.model.EPCISResource
     */
    public EPCISResource getEventTime(UriInfo context, String businessLocation, String readPoint, String eventTime, String index);

    /**
     * Returns a representation of the event's read point resource according to the requested mime type
     *
     *
     * @param context
     * @param businessLocation
     * @param readPoint
     * @param eventTime
     * @param index
     *
     * @return an instance of org.epcis.fosstrak.restadapter.model.EPCISResource
     */
    public EPCISResource getReadPoint(UriInfo context, String businessLocation, String readPoint, String eventTime, String index);

    /**
     * Returns a representation of the event's business location resource according to the requested mime type
     *
     *
     * @param context
     * @param businessLocation
     * @param readPoint
     * @param eventTime
     * @param index
     *
     * @return an instance of org.epcis.fosstrak.restadapter.model.EPCISResource
     */
    public EPCISResource getBusinessLocation(UriInfo context, String businessLocation, String readPoint, String eventTime, String index);

    /**
     * Returns a representation of the event's disposition resource according to the requested mime type
     *
     *
     * @param context
     * @param businessLocation
     * @param readPoint
     * @param eventTime
     * @param index
     *
     * @return an instance of org.epcis.fosstrak.restadapter.model.EPCISResource
     */
    public EPCISResource getDisposition(UriInfo context, String businessLocation, String readPoint, String eventTime, String index);

    /**
     * Returns a representation of the event's event type resource according to the requested mime type
     *
     *
     * @param context
     * @param businessLocation
     * @param readPoint
     * @param eventTime
     * @param index
     *
     * @return an instance of org.epcis.fosstrak.restadapter.model.EPCISResource
     */
    public EPCISResource getEventType(UriInfo context, String businessLocation, String readPoint, String eventTime, String index);

    /**
     * Returns a representation of the event's epc list resource according to the requested mime type
     *
     *
     * @param context
     * @param businessLocation
     * @param readPoint
     * @param eventTime
     * @param index
     *
     * @return an instance of org.epcis.fosstrak.restadapter.model.EPCISResource
     */
    public EPCISResource getEpcs(UriInfo context, String businessLocation, String readPoint, String eventTime, String index);

    /**
     * Returns a representation of the event's epc resource according to the requested mime type
     *
     *
     * @param context
     * @param businessLocation
     * @param readPoint
     * @param eventTime
     * @param index
     * @param epc
     *
     * @return an instance of org.epcis.fosstrak.restadapter.model.EPCISResource
     */
    public EPCISResource getEpc(UriInfo context, String businessLocation, String readPoint, String eventTime, String index, String epc);

    /**
     * Returns a representation of a event business transaction list resource according to the requested mime type
     *
     *
     * @param context
     * @param businessLocation
     * @param readPoint
     * @param eventTime
     * @param index
     *
     * @return an instance of org.epcis.fosstrak.restadapter.model.EPCISResource
     */
    public EPCISResource getBusinessTransactions(UriInfo context, String businessLocation, String readPoint, String eventTime, String index);

    /**
     * Returns a representation of a event business transaction resource according to the requested mime type
     *
     *
     * @param context
     * @param businessLocation
     * @param readPoint
     * @param eventTime
     * @param index
     * @param businessTransaction
     *
     * @return an instance of org.epcis.fosstrak.restadapter.model.EPCISResource
     */
    public EPCISResource getBusinessTransaction(UriInfo context, String businessLocation, String readPoint, String eventTime, String index, String businessTransaction);

    /**
     * Returns a representation of the event's parent id resource according to the requested mime type
     *
     *
     * @param context
     * @param businessLocation
     * @param readPoint
     * @param eventTime
     * @param index
     *
     * @return an instance of org.epcis.fosstrak.restadapter.model.EPCISResource
     */
    public EPCISResource getParentID(UriInfo context, String businessLocation, String readPoint, String eventTime, String index);

    /**
     * Returns a representation of the event's epc class resource according to the requested mime type
     *
     *
     * @param context
     * @param businessLocation
     * @param readPoint
     * @param eventTime
     * @param index
     *
     * @return an instance of org.epcis.fosstrak.restadapter.model.EPCISResource
     */
    public EPCISResource getEPCClass(UriInfo context, String businessLocation, String readPoint, String eventTime, String index);

    /**
     * Returns a representation of the event's quantity resource according to the requested mime type
     *
     *
     * @param context
     * @param businessLocation
     * @param readPoint
     * @param eventTime
     * @param index
     *
     * @return an instance of org.epcis.fosstrak.restadapter.model.EPCISResource
     */
    public EPCISResource getQuantity(UriInfo context, String businessLocation, String readPoint, String eventTime, String index);

    /**
     * Returns a representation of the event query creator resource according to the requested mime type
     *
     *
     * @param context
     * @param eventTime
     * @param recordTime
     * @param eventType
     * @param action
     * @param bizStep
     * @param disposition
     * @param readPoint
     * @param readPointWD
     * @param bizLocation
     * @param bizLocationWD
     * @param bizTransaction
     * @param epc
     * @param parentID
     * @param anyEPC
     * @param epcClass
     * @param quantity
     * @param fieldname
     * @param orderBy
     * @param orderDirection
     * @param eventCountLimit
     * @param maxEventCount
     *
     * @return an instance of org.epcis.fosstrak.restadapter.model.EPCISResource
     */
    public EPCISResource getEventQuery(UriInfo context, String eventTime, String recordTime, String eventType, String action, String bizStep, String disposition, String readPoint, String readPointWD, String bizLocation, String bizLocationWD, String bizTransaction, String epc, String parentID, String anyEPC, String epcClass, String quantity, String fieldname, String orderBy, String orderDirection, String eventCountLimit, String maxEventCount);

    /**
     * Returns a representation of the query results resource according to the requested mime type
     *
     *
     * @param context
     * @param eventTime
     * @param recordTime
     * @param eventType
     * @param action
     * @param bizStep
     * @param disposition
     * @param readPoint
     * @param readPointWD
     * @param bizLocation
     * @param bizLocationWD
     * @param bizTransaction
     * @param epc
     * @param parentID
     * @param anyEPC
     * @param epcClass
     * @param quantity
     * @param fieldname
     * @param orderBy
     * @param orderDirection
     * @param eventCountLimit
     * @param maxEventCount
     *
     * @return an instance of org.epcis.fosstrak.restadapter.model.EPCISResource
     */
    public EPCISResource getResults(UriInfo context, String eventTime, String recordTime, String eventType, String action, String bizStep, String disposition, String readPoint, String readPointWD, String bizLocation, String bizLocationWD, String bizTransaction, String epc, String parentID, String anyEPC, String epcClass, String quantity, String fieldname, String orderBy, String orderDirection, String eventCountLimit, String maxEventCount);
}
