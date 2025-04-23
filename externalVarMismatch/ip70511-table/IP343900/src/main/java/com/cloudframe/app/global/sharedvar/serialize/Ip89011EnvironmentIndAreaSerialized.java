package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip89011EnvironmentIndAreaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip89011EnvironmentIndAreaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip89011EnvironmentIndAreaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_89011_ENVIRONMENT_IND_AREA_LENGTH = 92;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp89011Environment;
            protected int beginIp89011EnvironmentIndAreaConditionGroup3;
	
	/**
	* Constructor for Ip89011EnvironmentIndAreaSerialized
	**/
    public Ip89011EnvironmentIndAreaSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip89011EnvironmentIndAreaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_89011_ENVIRONMENT_IND_AREA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginIp89011Environment = getStartOffset() + 12;	// set offset for serialization
  
  
                beginIp89011EnvironmentIndAreaConditionGroup3 = getStartOffset() + 38;	// filler with 88
  
  
	   /*  end of offset */
	}
     int localIp89011EnvironmentCounter = -1;
     public boolean isIp89011EnvironmentModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp89011EnvironmentCounter != sharedCounter;
         localIp89011EnvironmentCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_89011_ENVIRONMENT_LEN = 3;
	/**
	 * 	serialize this Ip89011Environment
	 */
   protected void serializeIp89011Environment(char[] ip89011Environment) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip89011Environment,0,getStringValue(),beginIp89011Environment,IP_89011_ENVIRONMENT_LEN);
       localIp89011EnvironmentCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp89011EnvironmentConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp89011Environment is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp89011Environment() {	 
   		return (substring(getStringValue(),beginIp89011Environment,beginIp89011Environment + IP_89011_ENVIRONMENT_LEN));
   	}
     int localIp89011EnvironmentIndAreaConditionGroup3Counter = -1;
     public boolean isIp89011EnvironmentIndAreaConditionGroup3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp89011EnvironmentIndAreaConditionGroup3Counter != sharedCounter;
         localIp89011EnvironmentIndAreaConditionGroup3Counter = sharedCounter; return hasModified;
     }
	protected static final int IP_89011_ENVIRONMENT_IND_AREA_CONDITION_GROUP_3_LEN = 1;
	/**
	 * 	serialize this Ip89011EnvironmentIndAreaConditionGroup3
	 */
   protected void serializeIp89011EnvironmentIndAreaConditionGroup3(char[] ip89011EnvironmentIndAreaConditionGroup3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip89011EnvironmentIndAreaConditionGroup3,0,getStringValue(),beginIp89011EnvironmentIndAreaConditionGroup3,IP_89011_ENVIRONMENT_IND_AREA_CONDITION_GROUP_3_LEN);
       localIp89011EnvironmentIndAreaConditionGroup3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp89011EnvironmentIndAreaConditionGroup3Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp89011EnvironmentIndAreaConditionGroup3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp89011EnvironmentIndAreaConditionGroup3() {	 
   		return (substring(getStringValue(),beginIp89011EnvironmentIndAreaConditionGroup3,beginIp89011EnvironmentIndAreaConditionGroup3 + IP_89011_ENVIRONMENT_IND_AREA_CONDITION_GROUP_3_LEN));
   	}




}
  
