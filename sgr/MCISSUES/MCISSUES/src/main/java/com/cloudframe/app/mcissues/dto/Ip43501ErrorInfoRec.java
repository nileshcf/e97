package com.cloudframe.app.mcissues.dto;

/**
*  The class Ip43501ErrorInfoRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:20. using version 5.0.0.254
**/


import com.cloudframe.app.mcissues.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip43501ErrorInfoRec extends Ip43501ErrorInfoRecSerialized {
   
				private Ip43501SortSolution ip43501SortSolution = new Ip43501SortSolution();
				private Ip43501FileStatusRec ip43501FileStatusRec = new Ip43501FileStatusRec();
	
	/**
	* Constructor for Ip43501ErrorInfoRec
	**/
    public Ip43501ErrorInfoRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			ip43501SortSolution.setParent(this,getStartOffset() + 0);
	       			ip43501FileStatusRec.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of ip43501SortSolution
	 *	@return ip43501SortSolution
	 */   
	 public Ip43501SortSolution getIp43501SortSolution() {
   	return ip43501SortSolution;
   }
   /**
	* 	Update Ip43501SortSolution with the passed value
	*   Corresponding COBOL Variable is IP43501-SORT-SOLUTION
	*	@param value
	*/
   public void setIp43501SortSolution(char[] value) {
      ip43501SortSolution.setString(value); 
   }   
    
     /**
	 * 	Update Ip43501SortSolution 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp43501SortSolution(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip43501SortSolution.begin,ip43501SortSolution.length());
   }
   
     /**
	 * 	Update Ip43501SortSolution 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp43501SortSolution(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip43501SortSolution.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip43501SortSolution with another Field
	 *	@param value
	 */
   public void setIp43501SortSolution(Field source) {
   	replace(source,0,source.length(),ip43501SortSolution.begin,ip43501SortSolution.length());
   }  
   
     /**
	 * 	Update Ip43501SortSolution 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp43501SortSolution(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip43501SortSolution.begin,ip43501SortSolution.length());
   }
   
     /**
	 * 	Update Ip43501SortSolution 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp43501SortSolution(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip43501SortSolution.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip43501FileStatusRec
	 *	@return ip43501FileStatusRec
	 */   
	 public Ip43501FileStatusRec getIp43501FileStatusRec() {
   	return ip43501FileStatusRec;
   }
   /**
	* 	Update Ip43501FileStatusRec with the passed value
	*   Corresponding COBOL Variable is IP43501-FILE-STATUS-REC
	*	@param value
	*/
   public void setIp43501FileStatusRec(char[] value) {
      ip43501FileStatusRec.setString(value); 
   }   
    
     /**
	 * 	Update Ip43501FileStatusRec 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp43501FileStatusRec(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip43501FileStatusRec.begin,ip43501FileStatusRec.length());
   }
   
     /**
	 * 	Update Ip43501FileStatusRec 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp43501FileStatusRec(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip43501FileStatusRec.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip43501FileStatusRec with another Field
	 *	@param value
	 */
   public void setIp43501FileStatusRec(Field source) {
   	replace(source,0,source.length(),ip43501FileStatusRec.begin,ip43501FileStatusRec.length());
   }  
   
     /**
	 * 	Update Ip43501FileStatusRec 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp43501FileStatusRec(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip43501FileStatusRec.begin,ip43501FileStatusRec.length());
   }
   
     /**
	 * 	Update Ip43501FileStatusRec 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp43501FileStatusRec(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip43501FileStatusRec.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Ip43501ErrorInfoRec
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          ip43501SortSolution.initialize();
     
   }

		public static int getIp43501ErrorInfoRecFieldLength() {
			return IP_43501_ERROR_INFO_REC_LENGTH;
		}

}
  
