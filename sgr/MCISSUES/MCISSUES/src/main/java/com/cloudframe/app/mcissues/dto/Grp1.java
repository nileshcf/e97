package com.cloudframe.app.mcissues.dto;

/**
*  The class Grp1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:06. using version 5.0.0.256
**/


import com.cloudframe.app.mcissues.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Grp1 extends Grp1Serialized {
   
				private Report1HeadingLine11701 report1HeadingLine11701 = new Report1HeadingLine11701();
	
	/**
	* Constructor for Grp1
	**/
    public Grp1() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			report1HeadingLine11701.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of report1HeadingLine11701
	 *	@return report1HeadingLine11701
	 */   
	 public Report1HeadingLine11701 getReport1HeadingLine11701() {
   	return report1HeadingLine11701;
   }
   /**
	* 	Update Report1HeadingLine11701 with the passed value
	*   Corresponding COBOL Variable is 701-REPORT-1-HEADING-LINE-11
	*	@param value
	*/
   public void setReport1HeadingLine11701(char[] value) {
      report1HeadingLine11701.setString(value); 
   }   
    
     /**
	 * 	Update Report1HeadingLine11701 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setReport1HeadingLine11701(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,report1HeadingLine11701.begin,report1HeadingLine11701.length());
   }
   
     /**
	 * 	Update Report1HeadingLine11701 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setReport1HeadingLine11701(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,report1HeadingLine11701.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Report1HeadingLine11701 with another Field
	 *	@param value
	 */
   public void setReport1HeadingLine11701(Field source) {
   	replace(source,0,source.length(),report1HeadingLine11701.begin,report1HeadingLine11701.length());
   }  
   
     /**
	 * 	Update Report1HeadingLine11701 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setReport1HeadingLine11701(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,report1HeadingLine11701.begin,report1HeadingLine11701.length());
   }
   
     /**
	 * 	Update Report1HeadingLine11701 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setReport1HeadingLine11701(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,report1HeadingLine11701.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getGrp1FieldLength() {
			return GRP_1_LENGTH;
		}

}
  
