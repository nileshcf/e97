package com.cloudframe.app.refmod3.dto;

/**
*  The class AdRptDate7JulnGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:00. using version 5.0.0.256
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class AdRptDate7JulnGroup extends AdRptDate7JulnGroupSerialized { 
   

								private long adRptDate7Juln;
	
	/**
	* Constructor for AdRptDate7JulnGroup
	**/
    public AdRptDate7JulnGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setAdRptDate7Juln(2022100L);
    }


 

	/**
	 *	Returns the value of adRptDate7Juln
	 *	@return adRptDate7Juln
	 */
	public long getAdRptDate7Juln() throws CFException {
       if (isAdRptDate7JulnModified()) { 
           adRptDate7Juln = refreshAdRptDate7Juln();
        }
   		return adRptDate7Juln;
	}
	

	
	   
	/**
	 * 	Update AdRptDate7Juln with the passed value
	 *  Corresponding COBOL Variable is AD-RPT-DATE7-JULN
	 *	@param number
	 */
	public void setAdRptDate7Juln(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    adRptDate7Juln = checkAdRptDate7JulnMaxLimit(number); 
		serializeAdRptDate7Juln(adRptDate7Juln);
	}
	

	/**
	 * 	Update AdRptDate7Juln with the passed value
	 *	@param value (String or char[])
	 */
	public void setAdRptDate7Juln(char[] value) throws CFException {
		 adRptDate7Juln = serializeAdRptDate7Juln(value);
	}
	/**
	 * 	Update AdRptDate7Juln with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAdRptDate7JulnString(char[] value) throws CFException {
		 setAdRptDate7Juln(value);
	}

	
	
	

		public static int getAdRptDate7JulnGroupFieldLength() {
			return AD_RPT_DATE_7_JULN_GROUP_LENGTH;
		}

}
  
