package com.cloudframe.app.casecb01.dto;

/**
*  The class Availablecolors is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:45. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.List;
import com.cloudframe.app.data.Field;
import java.util.ArrayList;
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;


@Data
public class Availablecolors extends AvailablecolorsSerialized { 
   
      private List<char[]> color; 

	
	/**
	* Constructor for Availablecolors
	**/
    public Availablecolors() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Availablecolors. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Availablecolors(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Availablecolors
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         for (int index =0; index < COLOR_SIZE;index++) {
             setColor(index, CONSTANTS.SPACE_10);
         }
   }



	/**
	 *	Returns the xml format of Availablecolors
	 *	@return xml format of Availablecolors
	 */
	public String getXml() throws CFException {
		StringBuilder xmlContent = new StringBuilder();
		xmlContent.append("<AvailableColors>");
					for (int index = 0;index < COLOR_SIZE;index++) {
						xmlContent.append("<Color>").append(CFUtil.encodeXML(getColor(index))).append("</Color>");
					}
		xmlContent.append("</AvailableColors>");
		return xmlContent.toString();
	}
}
  
