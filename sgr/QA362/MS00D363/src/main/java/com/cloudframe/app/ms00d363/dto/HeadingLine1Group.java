package com.cloudframe.app.ms00d363.dto;

/**
*  The class HeadingLine1Group is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:32. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class HeadingLine1Group extends HeadingLine1GroupSerialized {
   
					private HeadingLine1 headingLine1 = new HeadingLine1();
					private CertificationHeaderLine certificationHeaderLine = new CertificationHeaderLine();
	
	/**
	* Constructor for HeadingLine1Group
	**/
    public HeadingLine1Group() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			headingLine1.setParent(this,getStartOffset() + 0);
	       			certificationHeaderLine.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of headingLine1
	 *	@return headingLine1
	 */   
	 public HeadingLine1 getHeadingLine1() {
   	return headingLine1;
   }
   /**
	* 	Update HeadingLine1 with the passed value
	*   Corresponding COBOL Variable is HEADING-LINE-1
	*	@param value
	*/
   public void setHeadingLine1(char[] value) {
      headingLine1.setString(value); 
   }   
    
     /**
	 * 	Update HeadingLine1 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setHeadingLine1(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,headingLine1.begin,headingLine1.length());
   }
   
     /**
	 * 	Update HeadingLine1 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHeadingLine1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,headingLine1.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update HeadingLine1 with another Field
	 *	@param value
	 */
   public void setHeadingLine1(Field source) {
   	replace(source,0,source.length(),headingLine1.begin,headingLine1.length());
   }  
   
     /**
	 * 	Update HeadingLine1 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setHeadingLine1(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,headingLine1.begin,headingLine1.length());
   }
   
     /**
	 * 	Update HeadingLine1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHeadingLine1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,headingLine1.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of certificationHeaderLine
	 *	@return certificationHeaderLine
	 */   
	 public CertificationHeaderLine getCertificationHeaderLine() {
   	return certificationHeaderLine;
   }
   /**
	* 	Update CertificationHeaderLine with the passed value
	*   Corresponding COBOL Variable is CERTIFICATION-HEADER-LINE
	*	@param value
	*/
   public void setCertificationHeaderLine(char[] value) {
      certificationHeaderLine.setString(value); 
   }   
    
     /**
	 * 	Update CertificationHeaderLine 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCertificationHeaderLine(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,certificationHeaderLine.begin,certificationHeaderLine.length());
   }
   
     /**
	 * 	Update CertificationHeaderLine 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCertificationHeaderLine(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,certificationHeaderLine.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CertificationHeaderLine with another Field
	 *	@param value
	 */
   public void setCertificationHeaderLine(Field source) {
   	replace(source,0,source.length(),certificationHeaderLine.begin,certificationHeaderLine.length());
   }  
   
     /**
	 * 	Update CertificationHeaderLine 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCertificationHeaderLine(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,certificationHeaderLine.begin,certificationHeaderLine.length());
   }
   
     /**
	 * 	Update CertificationHeaderLine 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCertificationHeaderLine(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,certificationHeaderLine.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getHeadingLine1GroupFieldLength() {
			return HEADING_LINE_1_GROUP_LENGTH;
		}

}
  
