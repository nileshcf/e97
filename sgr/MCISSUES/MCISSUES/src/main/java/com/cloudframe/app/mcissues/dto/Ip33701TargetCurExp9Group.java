package com.cloudframe.app.mcissues.dto;

/**
*  The class Ip33701TargetCurExp9Group is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:06. using version 5.0.0.256
**/


import com.cloudframe.app.mcissues.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip33701TargetCurExp9Group extends Ip33701TargetCurExp9GroupSerialized {
   

								private int ip33701TargetCurExp9;

						private char[] ip33701TargetCurExp = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip33701TargetCurExp9Group
	**/
    public Ip33701TargetCurExp9Group() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of ip33701TargetCurExp9
	 *	@return ip33701TargetCurExp9
	 */
	public int getIp33701TargetCurExp9() throws CFException {
       if (isIp33701TargetCurExp9Modified()) { 
           ip33701TargetCurExp9 = refreshIp33701TargetCurExp9();
        }
   		return ip33701TargetCurExp9;
	}
	

	
	   
	/**
	 * 	Update Ip33701TargetCurExp9 with the passed value
	 *  Corresponding COBOL Variable is IP33701-TARGET-CUR-EXP-9
	 *	@param number
	 */
	public void setIp33701TargetCurExp9(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip33701TargetCurExp9 = checkIp33701TargetCurExp9MaxLimit(number); 
		serializeIp33701TargetCurExp9(ip33701TargetCurExp9);
	}
	

	public void setIp33701TargetCurExp9(long number) {
	    number = checkIp33701TargetCurExp9MaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp33701TargetCurExp9((int)number);
	}
	
	/**
	 * 	Update Ip33701TargetCurExp9 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp33701TargetCurExp9(char[] value) throws CFException {
		 ip33701TargetCurExp9 = serializeIp33701TargetCurExp9(value);
	}
	/**
	 * 	Update Ip33701TargetCurExp9 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp33701TargetCurExp9String(char[] value) throws CFException {
		 setIp33701TargetCurExp9(value);
	}
	/**
	 *	Returns the value of ip33701TargetCurExp
	 *	@return ip33701TargetCurExp
	 */
   public char[] getIp33701TargetCurExp() throws CFException{
     if (isIp33701TargetCurExpModified()) { 
        ip33701TargetCurExp = refreshIp33701TargetCurExp();
     }
   		return ip33701TargetCurExp;
   }

  
	/**
	*  set variable ip33701TargetCurExp
	*  Corresponding COBOL Variable is IP33701-TARGET-CUR-EXP
	*  @param value
	**/
   public void setIp33701TargetCurExp(char[] value) {
      ip33701TargetCurExp = checkIp33701TargetCurExpConstraints(value);
      serializeIp33701TargetCurExp(ip33701TargetCurExp);
   } 

     /**
	 * 	Update Ip33701TargetCurExp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp33701TargetCurExp(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp33701TargetCurExp,ip33701TargetCurExp.length);
   	
   }
   
   public void setIp33701TargetCurExp(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp33701TargetCurExp,ip33701TargetCurExp.length);
   	
   }
   
     /**
	 * 	Update Ip33701TargetCurExp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp33701TargetCurExp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp33701TargetCurExp+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip33701TargetCurExp with another Field
	 *	@param value
	 */
   public void setIp33701TargetCurExp(Field source) {
       replace(source,0,source.length(),beginIp33701TargetCurExp,IP_33701_TARGET_CUR_EXP_LEN);
   	
   }  
   
     /**
	 * 	Update Ip33701TargetCurExp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp33701TargetCurExp(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp33701TargetCurExp,IP_33701_TARGET_CUR_EXP_LEN);
   	
   }
   
     /**
	 * 	Update Ip33701TargetCurExp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp33701TargetCurExp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp33701TargetCurExp+targetIndex,targetLen);
    
   }

	
	
	

		public static int getIp33701TargetCurExp9GroupFieldLength() {
			return IP_33701_TARGET_CUR_EXP_9_GROUP_LENGTH;
		}

}
  
