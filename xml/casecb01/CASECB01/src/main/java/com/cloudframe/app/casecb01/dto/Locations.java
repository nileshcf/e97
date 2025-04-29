package com.cloudframe.app.casecb01.dto;

/**
*  The class Locations is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:45. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;


@Data
public class Locations extends LocationsSerialized { 
   

						@Getter @Setter private char[] state = Field.fillLowValue(2);

						@Getter @Setter private char[] streetaddress = Field.fillLowValue(30);
	
	/**
	* Constructor for Locations
	**/
    public Locations() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Locations. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Locations(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Locations
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setState(CONSTANTS.SPACE_2);
         setStreetaddress(CONSTANTS.SPACE_30);
   }



	/**
	 *	Returns the xml format of Locations
	 *	@return xml format of Locations
	 */
	public String getXml() throws CFException {
		StringBuilder xmlContent = new StringBuilder();
		xmlContent.append("<Locations>");
					xmlContent.append("<State>").append(CFUtil.encodeXML(getState())).append("</State>");
					xmlContent.append("<StreetAddress>").append(CFUtil.encodeXML(getStreetaddress())).append("</StreetAddress>");
		xmlContent.append("</Locations>");
		return xmlContent.toString();
	}
}
  
