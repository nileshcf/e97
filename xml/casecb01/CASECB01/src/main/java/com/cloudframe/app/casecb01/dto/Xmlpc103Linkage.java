package com.cloudframe.app.casecb01.dto;

/**
*  The class Xmlpc103Linkage is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:45. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.exception.CFException;


@Data
public class Xmlpc103Linkage extends Xmlpc103LinkageSerialized {
   
				@Getter @Setter private InputRequest inputRequest = new InputRequest();
	
	/**
	* Constructor for Xmlpc103Linkage
	**/
    public Xmlpc103Linkage() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getInputRequest().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }






	/**
	 *	Returns the xml format of Xmlpc103Linkage
	 *	@return xml format of Xmlpc103Linkage
	 */
	public String getXml() throws CFException {
		StringBuilder xmlContent = new StringBuilder();
		xmlContent.append("<WSC-XMLPC103-LINKAGE>");
					xmlContent.append(getInputRequest().getXml());
		xmlContent.append("</WSC-XMLPC103-LINKAGE>");
		return xmlContent.toString();
	}
}
  
