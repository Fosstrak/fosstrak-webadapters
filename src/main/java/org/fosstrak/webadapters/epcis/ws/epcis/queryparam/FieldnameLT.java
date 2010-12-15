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
package org.fosstrak.webadapters.epcis.ws.epcis.queryparam;

import org.fosstrak.webadapters.epcis.ws.generated.QueryParameterExceptionResponse;
import java.text.ParseException;
import static org.fosstrak.webadapters.epcis.config.QueryParamConstants.*;

/**
 * Parameter for Fieldname less than (used for extensions)
 *
 * @author Mathias Mueller
 * mathias.mueller(at)unifr.ch
 *
 *
 */
public class FieldnameLT extends AbstractRightClassChooserParameter {

    /**
     * Constructor
     *
     *
     * @param value
     *
     * @throws ParseException
     * @throws QueryParameterExceptionResponse
     */
    public FieldnameLT(String value) throws ParseException, QueryParameterExceptionResponse {
        super(FIELDNAME_REST, LT_fieldname, value);
    }
}
