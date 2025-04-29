package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup96Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:24. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup96Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup96Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_96_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P2946S;
            protected  int beginIp65504P2946L;
            protected  int beginIp65504P2947S;
            protected  int beginIp65504P2947L;
            protected  int beginIp65504P2948S;
            protected  int beginIp65504P2948L;
            protected  int beginIp65504P2949S;
            protected  int beginIp65504P2949L;
            protected  int beginIp65504P2950S;
            protected  int beginIp65504P2950L;
            protected  int beginIp65504P2951S;
            protected  int beginIp65504P2951L;
            protected  int beginIp65504P2952S;
            protected  int beginIp65504P2952L;
            protected  int beginIp65504P2953S;
            protected  int beginIp65504P2953L;
            protected  int beginIp65504P2954S;
            protected  int beginIp65504P2954L;
            protected  int beginIp65504P2955S;
            protected  int beginIp65504P2955L;
            protected  int beginIp65504P2956S;
            protected  int beginIp65504P2956L;
            protected  int beginIp65504P2957S;
            protected  int beginIp65504P2957L;
            protected  int beginIp65504P2958S;
            protected  int beginIp65504P2958L;
            protected  int beginIp65504P2959S;
            protected  int beginIp65504P2959L;
            protected  int beginIp65504P2960S;
            protected  int beginIp65504P2960L;
            protected  int beginIp65504P2961S;
            protected  int beginIp65504P2961L;
            protected  int beginIp65504P2962S;
            protected  int beginIp65504P2962L;
            protected  int beginIp65504P2963S;
            protected  int beginIp65504P2963L;
            protected  int beginIp65504P2964S;
            protected  int beginIp65504P2964L;
            protected  int beginIp65504P2965S;
            protected  int beginIp65504P2965L;
            protected  int beginIp65504P2966S;
            protected  int beginIp65504P2966L;
            protected  int beginIp65504P2967S;
            protected  int beginIp65504P2967L;
            protected  int beginIp65504P2968S;
            protected  int beginIp65504P2968L;
            protected  int beginIp65504P2969S;
            protected  int beginIp65504P2969L;
            protected  int beginIp65504P2970S;
            protected  int beginIp65504P2970L;
            protected  int beginIp65504P2971S;
            protected  int beginIp65504P2971L;
            protected  int beginIp65504P2972S;
            protected  int beginIp65504P2972L;
            protected  int beginIp65504P2973S;
            protected  int beginIp65504P2973L;
            protected  int beginIp65504P2974S;
            protected  int beginIp65504P2974L;
            protected  int beginIp65504P2975S;
            protected  int beginIp65504P2975L;
            protected  int beginIp65504P2976S;
            protected  int beginIp65504P2976L;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup96Serialized
	**/
    public Ip65504PdsNamesLargeGroup96Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup96Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup96Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup96Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,23556); // serialize this field at offset 23556 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup96Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 23556 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup96Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_96_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P2946S = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P2946L = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P2947S = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P2947L = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P2948S = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P2948L = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P2949S = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P2949L = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P2950S = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P2950L = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P2951S = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P2951L = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P2952S = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P2952L = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P2953S = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P2953L = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P2954S = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P2954L = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P2955S = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P2955L = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P2956S = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P2956L = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P2957S = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P2957L = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P2958S = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P2958L = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P2959S = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P2959L = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P2960S = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P2960L = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P2961S = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P2961L = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P2962S = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P2962L = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P2963S = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P2963L = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P2964S = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P2964L = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P2965S = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P2965L = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P2966S = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P2966L = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P2967S = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P2967L = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P2968S = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P2968L = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P2969S = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P2969L = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P2970S = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P2970L = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P2971S = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P2971L = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P2972S = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P2972L = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P2973S = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P2973L = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P2974S = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P2974L = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P2975S = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P2975L = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P2976S = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P2976L = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P2946SCounter = -1;
         public boolean isIp65504P2946SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2946SCounter != sharedCounter;
            localIp65504P2946SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2946_S_LEN = 2;
  	/**
	 * serializeIp65504P2946S
	 */
	protected void serializeIp65504P2946S(short ip65504P2946S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2946S,IP_65504_P_2946_S_LEN)
                  ,beginIp65504P2946S
                  ,IP_65504_P_2946_S_LEN
                 );
            localIp65504P2946SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2946SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2946S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2946S() {	 
			return (getShort(beginIp65504P2946S));
   	}
         int localIp65504P2946LCounter = -1;
         public boolean isIp65504P2946LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2946LCounter != sharedCounter;
            localIp65504P2946LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2946_L_LEN = 2;
  	/**
	 * serializeIp65504P2946L
	 */
	protected void serializeIp65504P2946L(short ip65504P2946L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2946L,IP_65504_P_2946_L_LEN)
                  ,beginIp65504P2946L
                  ,IP_65504_P_2946_L_LEN
                 );
            localIp65504P2946LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2946LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2946L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2946L() {	 
			return (getShort(beginIp65504P2946L));
   	}
         int localIp65504P2947SCounter = -1;
         public boolean isIp65504P2947SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2947SCounter != sharedCounter;
            localIp65504P2947SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2947_S_LEN = 2;
  	/**
	 * serializeIp65504P2947S
	 */
	protected void serializeIp65504P2947S(short ip65504P2947S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2947S,IP_65504_P_2947_S_LEN)
                  ,beginIp65504P2947S
                  ,IP_65504_P_2947_S_LEN
                 );
            localIp65504P2947SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2947SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2947S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2947S() {	 
			return (getShort(beginIp65504P2947S));
   	}
         int localIp65504P2947LCounter = -1;
         public boolean isIp65504P2947LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2947LCounter != sharedCounter;
            localIp65504P2947LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2947_L_LEN = 2;
  	/**
	 * serializeIp65504P2947L
	 */
	protected void serializeIp65504P2947L(short ip65504P2947L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2947L,IP_65504_P_2947_L_LEN)
                  ,beginIp65504P2947L
                  ,IP_65504_P_2947_L_LEN
                 );
            localIp65504P2947LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2947LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2947L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2947L() {	 
			return (getShort(beginIp65504P2947L));
   	}
         int localIp65504P2948SCounter = -1;
         public boolean isIp65504P2948SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2948SCounter != sharedCounter;
            localIp65504P2948SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2948_S_LEN = 2;
  	/**
	 * serializeIp65504P2948S
	 */
	protected void serializeIp65504P2948S(short ip65504P2948S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2948S,IP_65504_P_2948_S_LEN)
                  ,beginIp65504P2948S
                  ,IP_65504_P_2948_S_LEN
                 );
            localIp65504P2948SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2948SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2948S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2948S() {	 
			return (getShort(beginIp65504P2948S));
   	}
         int localIp65504P2948LCounter = -1;
         public boolean isIp65504P2948LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2948LCounter != sharedCounter;
            localIp65504P2948LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2948_L_LEN = 2;
  	/**
	 * serializeIp65504P2948L
	 */
	protected void serializeIp65504P2948L(short ip65504P2948L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2948L,IP_65504_P_2948_L_LEN)
                  ,beginIp65504P2948L
                  ,IP_65504_P_2948_L_LEN
                 );
            localIp65504P2948LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2948LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2948L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2948L() {	 
			return (getShort(beginIp65504P2948L));
   	}
         int localIp65504P2949SCounter = -1;
         public boolean isIp65504P2949SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2949SCounter != sharedCounter;
            localIp65504P2949SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2949_S_LEN = 2;
  	/**
	 * serializeIp65504P2949S
	 */
	protected void serializeIp65504P2949S(short ip65504P2949S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2949S,IP_65504_P_2949_S_LEN)
                  ,beginIp65504P2949S
                  ,IP_65504_P_2949_S_LEN
                 );
            localIp65504P2949SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2949SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2949S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2949S() {	 
			return (getShort(beginIp65504P2949S));
   	}
         int localIp65504P2949LCounter = -1;
         public boolean isIp65504P2949LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2949LCounter != sharedCounter;
            localIp65504P2949LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2949_L_LEN = 2;
  	/**
	 * serializeIp65504P2949L
	 */
	protected void serializeIp65504P2949L(short ip65504P2949L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2949L,IP_65504_P_2949_L_LEN)
                  ,beginIp65504P2949L
                  ,IP_65504_P_2949_L_LEN
                 );
            localIp65504P2949LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2949LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2949L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2949L() {	 
			return (getShort(beginIp65504P2949L));
   	}
         int localIp65504P2950SCounter = -1;
         public boolean isIp65504P2950SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2950SCounter != sharedCounter;
            localIp65504P2950SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2950_S_LEN = 2;
  	/**
	 * serializeIp65504P2950S
	 */
	protected void serializeIp65504P2950S(short ip65504P2950S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2950S,IP_65504_P_2950_S_LEN)
                  ,beginIp65504P2950S
                  ,IP_65504_P_2950_S_LEN
                 );
            localIp65504P2950SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2950SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2950S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2950S() {	 
			return (getShort(beginIp65504P2950S));
   	}
         int localIp65504P2950LCounter = -1;
         public boolean isIp65504P2950LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2950LCounter != sharedCounter;
            localIp65504P2950LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2950_L_LEN = 2;
  	/**
	 * serializeIp65504P2950L
	 */
	protected void serializeIp65504P2950L(short ip65504P2950L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2950L,IP_65504_P_2950_L_LEN)
                  ,beginIp65504P2950L
                  ,IP_65504_P_2950_L_LEN
                 );
            localIp65504P2950LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2950LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2950L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2950L() {	 
			return (getShort(beginIp65504P2950L));
   	}
         int localIp65504P2951SCounter = -1;
         public boolean isIp65504P2951SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2951SCounter != sharedCounter;
            localIp65504P2951SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2951_S_LEN = 2;
  	/**
	 * serializeIp65504P2951S
	 */
	protected void serializeIp65504P2951S(short ip65504P2951S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2951S,IP_65504_P_2951_S_LEN)
                  ,beginIp65504P2951S
                  ,IP_65504_P_2951_S_LEN
                 );
            localIp65504P2951SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2951SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2951S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2951S() {	 
			return (getShort(beginIp65504P2951S));
   	}
         int localIp65504P2951LCounter = -1;
         public boolean isIp65504P2951LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2951LCounter != sharedCounter;
            localIp65504P2951LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2951_L_LEN = 2;
  	/**
	 * serializeIp65504P2951L
	 */
	protected void serializeIp65504P2951L(short ip65504P2951L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2951L,IP_65504_P_2951_L_LEN)
                  ,beginIp65504P2951L
                  ,IP_65504_P_2951_L_LEN
                 );
            localIp65504P2951LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2951LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2951L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2951L() {	 
			return (getShort(beginIp65504P2951L));
   	}
         int localIp65504P2952SCounter = -1;
         public boolean isIp65504P2952SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2952SCounter != sharedCounter;
            localIp65504P2952SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2952_S_LEN = 2;
  	/**
	 * serializeIp65504P2952S
	 */
	protected void serializeIp65504P2952S(short ip65504P2952S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2952S,IP_65504_P_2952_S_LEN)
                  ,beginIp65504P2952S
                  ,IP_65504_P_2952_S_LEN
                 );
            localIp65504P2952SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2952SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2952S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2952S() {	 
			return (getShort(beginIp65504P2952S));
   	}
         int localIp65504P2952LCounter = -1;
         public boolean isIp65504P2952LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2952LCounter != sharedCounter;
            localIp65504P2952LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2952_L_LEN = 2;
  	/**
	 * serializeIp65504P2952L
	 */
	protected void serializeIp65504P2952L(short ip65504P2952L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2952L,IP_65504_P_2952_L_LEN)
                  ,beginIp65504P2952L
                  ,IP_65504_P_2952_L_LEN
                 );
            localIp65504P2952LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2952LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2952L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2952L() {	 
			return (getShort(beginIp65504P2952L));
   	}
         int localIp65504P2953SCounter = -1;
         public boolean isIp65504P2953SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2953SCounter != sharedCounter;
            localIp65504P2953SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2953_S_LEN = 2;
  	/**
	 * serializeIp65504P2953S
	 */
	protected void serializeIp65504P2953S(short ip65504P2953S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2953S,IP_65504_P_2953_S_LEN)
                  ,beginIp65504P2953S
                  ,IP_65504_P_2953_S_LEN
                 );
            localIp65504P2953SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2953SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2953S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2953S() {	 
			return (getShort(beginIp65504P2953S));
   	}
         int localIp65504P2953LCounter = -1;
         public boolean isIp65504P2953LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2953LCounter != sharedCounter;
            localIp65504P2953LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2953_L_LEN = 2;
  	/**
	 * serializeIp65504P2953L
	 */
	protected void serializeIp65504P2953L(short ip65504P2953L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2953L,IP_65504_P_2953_L_LEN)
                  ,beginIp65504P2953L
                  ,IP_65504_P_2953_L_LEN
                 );
            localIp65504P2953LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2953LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2953L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2953L() {	 
			return (getShort(beginIp65504P2953L));
   	}
         int localIp65504P2954SCounter = -1;
         public boolean isIp65504P2954SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2954SCounter != sharedCounter;
            localIp65504P2954SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2954_S_LEN = 2;
  	/**
	 * serializeIp65504P2954S
	 */
	protected void serializeIp65504P2954S(short ip65504P2954S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2954S,IP_65504_P_2954_S_LEN)
                  ,beginIp65504P2954S
                  ,IP_65504_P_2954_S_LEN
                 );
            localIp65504P2954SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2954SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2954S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2954S() {	 
			return (getShort(beginIp65504P2954S));
   	}
         int localIp65504P2954LCounter = -1;
         public boolean isIp65504P2954LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2954LCounter != sharedCounter;
            localIp65504P2954LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2954_L_LEN = 2;
  	/**
	 * serializeIp65504P2954L
	 */
	protected void serializeIp65504P2954L(short ip65504P2954L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2954L,IP_65504_P_2954_L_LEN)
                  ,beginIp65504P2954L
                  ,IP_65504_P_2954_L_LEN
                 );
            localIp65504P2954LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2954LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2954L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2954L() {	 
			return (getShort(beginIp65504P2954L));
   	}
         int localIp65504P2955SCounter = -1;
         public boolean isIp65504P2955SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2955SCounter != sharedCounter;
            localIp65504P2955SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2955_S_LEN = 2;
  	/**
	 * serializeIp65504P2955S
	 */
	protected void serializeIp65504P2955S(short ip65504P2955S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2955S,IP_65504_P_2955_S_LEN)
                  ,beginIp65504P2955S
                  ,IP_65504_P_2955_S_LEN
                 );
            localIp65504P2955SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2955SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2955S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2955S() {	 
			return (getShort(beginIp65504P2955S));
   	}
         int localIp65504P2955LCounter = -1;
         public boolean isIp65504P2955LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2955LCounter != sharedCounter;
            localIp65504P2955LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2955_L_LEN = 2;
  	/**
	 * serializeIp65504P2955L
	 */
	protected void serializeIp65504P2955L(short ip65504P2955L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2955L,IP_65504_P_2955_L_LEN)
                  ,beginIp65504P2955L
                  ,IP_65504_P_2955_L_LEN
                 );
            localIp65504P2955LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2955LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2955L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2955L() {	 
			return (getShort(beginIp65504P2955L));
   	}
         int localIp65504P2956SCounter = -1;
         public boolean isIp65504P2956SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2956SCounter != sharedCounter;
            localIp65504P2956SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2956_S_LEN = 2;
  	/**
	 * serializeIp65504P2956S
	 */
	protected void serializeIp65504P2956S(short ip65504P2956S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2956S,IP_65504_P_2956_S_LEN)
                  ,beginIp65504P2956S
                  ,IP_65504_P_2956_S_LEN
                 );
            localIp65504P2956SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2956SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2956S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2956S() {	 
			return (getShort(beginIp65504P2956S));
   	}
         int localIp65504P2956LCounter = -1;
         public boolean isIp65504P2956LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2956LCounter != sharedCounter;
            localIp65504P2956LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2956_L_LEN = 2;
  	/**
	 * serializeIp65504P2956L
	 */
	protected void serializeIp65504P2956L(short ip65504P2956L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2956L,IP_65504_P_2956_L_LEN)
                  ,beginIp65504P2956L
                  ,IP_65504_P_2956_L_LEN
                 );
            localIp65504P2956LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2956LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2956L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2956L() {	 
			return (getShort(beginIp65504P2956L));
   	}
         int localIp65504P2957SCounter = -1;
         public boolean isIp65504P2957SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2957SCounter != sharedCounter;
            localIp65504P2957SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2957_S_LEN = 2;
  	/**
	 * serializeIp65504P2957S
	 */
	protected void serializeIp65504P2957S(short ip65504P2957S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2957S,IP_65504_P_2957_S_LEN)
                  ,beginIp65504P2957S
                  ,IP_65504_P_2957_S_LEN
                 );
            localIp65504P2957SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2957SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2957S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2957S() {	 
			return (getShort(beginIp65504P2957S));
   	}
         int localIp65504P2957LCounter = -1;
         public boolean isIp65504P2957LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2957LCounter != sharedCounter;
            localIp65504P2957LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2957_L_LEN = 2;
  	/**
	 * serializeIp65504P2957L
	 */
	protected void serializeIp65504P2957L(short ip65504P2957L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2957L,IP_65504_P_2957_L_LEN)
                  ,beginIp65504P2957L
                  ,IP_65504_P_2957_L_LEN
                 );
            localIp65504P2957LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2957LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2957L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2957L() {	 
			return (getShort(beginIp65504P2957L));
   	}
         int localIp65504P2958SCounter = -1;
         public boolean isIp65504P2958SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2958SCounter != sharedCounter;
            localIp65504P2958SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2958_S_LEN = 2;
  	/**
	 * serializeIp65504P2958S
	 */
	protected void serializeIp65504P2958S(short ip65504P2958S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2958S,IP_65504_P_2958_S_LEN)
                  ,beginIp65504P2958S
                  ,IP_65504_P_2958_S_LEN
                 );
            localIp65504P2958SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2958SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2958S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2958S() {	 
			return (getShort(beginIp65504P2958S));
   	}
         int localIp65504P2958LCounter = -1;
         public boolean isIp65504P2958LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2958LCounter != sharedCounter;
            localIp65504P2958LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2958_L_LEN = 2;
  	/**
	 * serializeIp65504P2958L
	 */
	protected void serializeIp65504P2958L(short ip65504P2958L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2958L,IP_65504_P_2958_L_LEN)
                  ,beginIp65504P2958L
                  ,IP_65504_P_2958_L_LEN
                 );
            localIp65504P2958LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2958LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2958L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2958L() {	 
			return (getShort(beginIp65504P2958L));
   	}
         int localIp65504P2959SCounter = -1;
         public boolean isIp65504P2959SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2959SCounter != sharedCounter;
            localIp65504P2959SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2959_S_LEN = 2;
  	/**
	 * serializeIp65504P2959S
	 */
	protected void serializeIp65504P2959S(short ip65504P2959S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2959S,IP_65504_P_2959_S_LEN)
                  ,beginIp65504P2959S
                  ,IP_65504_P_2959_S_LEN
                 );
            localIp65504P2959SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2959SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2959S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2959S() {	 
			return (getShort(beginIp65504P2959S));
   	}
         int localIp65504P2959LCounter = -1;
         public boolean isIp65504P2959LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2959LCounter != sharedCounter;
            localIp65504P2959LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2959_L_LEN = 2;
  	/**
	 * serializeIp65504P2959L
	 */
	protected void serializeIp65504P2959L(short ip65504P2959L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2959L,IP_65504_P_2959_L_LEN)
                  ,beginIp65504P2959L
                  ,IP_65504_P_2959_L_LEN
                 );
            localIp65504P2959LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2959LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2959L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2959L() {	 
			return (getShort(beginIp65504P2959L));
   	}
         int localIp65504P2960SCounter = -1;
         public boolean isIp65504P2960SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2960SCounter != sharedCounter;
            localIp65504P2960SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2960_S_LEN = 2;
  	/**
	 * serializeIp65504P2960S
	 */
	protected void serializeIp65504P2960S(short ip65504P2960S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2960S,IP_65504_P_2960_S_LEN)
                  ,beginIp65504P2960S
                  ,IP_65504_P_2960_S_LEN
                 );
            localIp65504P2960SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2960SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2960S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2960S() {	 
			return (getShort(beginIp65504P2960S));
   	}
         int localIp65504P2960LCounter = -1;
         public boolean isIp65504P2960LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2960LCounter != sharedCounter;
            localIp65504P2960LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2960_L_LEN = 2;
  	/**
	 * serializeIp65504P2960L
	 */
	protected void serializeIp65504P2960L(short ip65504P2960L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2960L,IP_65504_P_2960_L_LEN)
                  ,beginIp65504P2960L
                  ,IP_65504_P_2960_L_LEN
                 );
            localIp65504P2960LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2960LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2960L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2960L() {	 
			return (getShort(beginIp65504P2960L));
   	}
         int localIp65504P2961SCounter = -1;
         public boolean isIp65504P2961SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2961SCounter != sharedCounter;
            localIp65504P2961SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2961_S_LEN = 2;
  	/**
	 * serializeIp65504P2961S
	 */
	protected void serializeIp65504P2961S(short ip65504P2961S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2961S,IP_65504_P_2961_S_LEN)
                  ,beginIp65504P2961S
                  ,IP_65504_P_2961_S_LEN
                 );
            localIp65504P2961SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2961SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2961S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2961S() {	 
			return (getShort(beginIp65504P2961S));
   	}
         int localIp65504P2961LCounter = -1;
         public boolean isIp65504P2961LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2961LCounter != sharedCounter;
            localIp65504P2961LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2961_L_LEN = 2;
  	/**
	 * serializeIp65504P2961L
	 */
	protected void serializeIp65504P2961L(short ip65504P2961L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2961L,IP_65504_P_2961_L_LEN)
                  ,beginIp65504P2961L
                  ,IP_65504_P_2961_L_LEN
                 );
            localIp65504P2961LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2961LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2961L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2961L() {	 
			return (getShort(beginIp65504P2961L));
   	}
         int localIp65504P2962SCounter = -1;
         public boolean isIp65504P2962SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2962SCounter != sharedCounter;
            localIp65504P2962SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2962_S_LEN = 2;
  	/**
	 * serializeIp65504P2962S
	 */
	protected void serializeIp65504P2962S(short ip65504P2962S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2962S,IP_65504_P_2962_S_LEN)
                  ,beginIp65504P2962S
                  ,IP_65504_P_2962_S_LEN
                 );
            localIp65504P2962SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2962SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2962S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2962S() {	 
			return (getShort(beginIp65504P2962S));
   	}
         int localIp65504P2962LCounter = -1;
         public boolean isIp65504P2962LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2962LCounter != sharedCounter;
            localIp65504P2962LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2962_L_LEN = 2;
  	/**
	 * serializeIp65504P2962L
	 */
	protected void serializeIp65504P2962L(short ip65504P2962L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2962L,IP_65504_P_2962_L_LEN)
                  ,beginIp65504P2962L
                  ,IP_65504_P_2962_L_LEN
                 );
            localIp65504P2962LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2962LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2962L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2962L() {	 
			return (getShort(beginIp65504P2962L));
   	}
         int localIp65504P2963SCounter = -1;
         public boolean isIp65504P2963SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2963SCounter != sharedCounter;
            localIp65504P2963SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2963_S_LEN = 2;
  	/**
	 * serializeIp65504P2963S
	 */
	protected void serializeIp65504P2963S(short ip65504P2963S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2963S,IP_65504_P_2963_S_LEN)
                  ,beginIp65504P2963S
                  ,IP_65504_P_2963_S_LEN
                 );
            localIp65504P2963SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2963SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2963S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2963S() {	 
			return (getShort(beginIp65504P2963S));
   	}
         int localIp65504P2963LCounter = -1;
         public boolean isIp65504P2963LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2963LCounter != sharedCounter;
            localIp65504P2963LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2963_L_LEN = 2;
  	/**
	 * serializeIp65504P2963L
	 */
	protected void serializeIp65504P2963L(short ip65504P2963L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2963L,IP_65504_P_2963_L_LEN)
                  ,beginIp65504P2963L
                  ,IP_65504_P_2963_L_LEN
                 );
            localIp65504P2963LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2963LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2963L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2963L() {	 
			return (getShort(beginIp65504P2963L));
   	}
         int localIp65504P2964SCounter = -1;
         public boolean isIp65504P2964SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2964SCounter != sharedCounter;
            localIp65504P2964SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2964_S_LEN = 2;
  	/**
	 * serializeIp65504P2964S
	 */
	protected void serializeIp65504P2964S(short ip65504P2964S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2964S,IP_65504_P_2964_S_LEN)
                  ,beginIp65504P2964S
                  ,IP_65504_P_2964_S_LEN
                 );
            localIp65504P2964SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2964SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2964S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2964S() {	 
			return (getShort(beginIp65504P2964S));
   	}
         int localIp65504P2964LCounter = -1;
         public boolean isIp65504P2964LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2964LCounter != sharedCounter;
            localIp65504P2964LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2964_L_LEN = 2;
  	/**
	 * serializeIp65504P2964L
	 */
	protected void serializeIp65504P2964L(short ip65504P2964L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2964L,IP_65504_P_2964_L_LEN)
                  ,beginIp65504P2964L
                  ,IP_65504_P_2964_L_LEN
                 );
            localIp65504P2964LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2964LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2964L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2964L() {	 
			return (getShort(beginIp65504P2964L));
   	}
         int localIp65504P2965SCounter = -1;
         public boolean isIp65504P2965SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2965SCounter != sharedCounter;
            localIp65504P2965SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2965_S_LEN = 2;
  	/**
	 * serializeIp65504P2965S
	 */
	protected void serializeIp65504P2965S(short ip65504P2965S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2965S,IP_65504_P_2965_S_LEN)
                  ,beginIp65504P2965S
                  ,IP_65504_P_2965_S_LEN
                 );
            localIp65504P2965SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2965SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2965S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2965S() {	 
			return (getShort(beginIp65504P2965S));
   	}
         int localIp65504P2965LCounter = -1;
         public boolean isIp65504P2965LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2965LCounter != sharedCounter;
            localIp65504P2965LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2965_L_LEN = 2;
  	/**
	 * serializeIp65504P2965L
	 */
	protected void serializeIp65504P2965L(short ip65504P2965L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2965L,IP_65504_P_2965_L_LEN)
                  ,beginIp65504P2965L
                  ,IP_65504_P_2965_L_LEN
                 );
            localIp65504P2965LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2965LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2965L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2965L() {	 
			return (getShort(beginIp65504P2965L));
   	}
         int localIp65504P2966SCounter = -1;
         public boolean isIp65504P2966SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2966SCounter != sharedCounter;
            localIp65504P2966SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2966_S_LEN = 2;
  	/**
	 * serializeIp65504P2966S
	 */
	protected void serializeIp65504P2966S(short ip65504P2966S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2966S,IP_65504_P_2966_S_LEN)
                  ,beginIp65504P2966S
                  ,IP_65504_P_2966_S_LEN
                 );
            localIp65504P2966SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2966SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2966S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2966S() {	 
			return (getShort(beginIp65504P2966S));
   	}
         int localIp65504P2966LCounter = -1;
         public boolean isIp65504P2966LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2966LCounter != sharedCounter;
            localIp65504P2966LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2966_L_LEN = 2;
  	/**
	 * serializeIp65504P2966L
	 */
	protected void serializeIp65504P2966L(short ip65504P2966L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2966L,IP_65504_P_2966_L_LEN)
                  ,beginIp65504P2966L
                  ,IP_65504_P_2966_L_LEN
                 );
            localIp65504P2966LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2966LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2966L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2966L() {	 
			return (getShort(beginIp65504P2966L));
   	}
         int localIp65504P2967SCounter = -1;
         public boolean isIp65504P2967SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2967SCounter != sharedCounter;
            localIp65504P2967SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2967_S_LEN = 2;
  	/**
	 * serializeIp65504P2967S
	 */
	protected void serializeIp65504P2967S(short ip65504P2967S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2967S,IP_65504_P_2967_S_LEN)
                  ,beginIp65504P2967S
                  ,IP_65504_P_2967_S_LEN
                 );
            localIp65504P2967SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2967SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2967S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2967S() {	 
			return (getShort(beginIp65504P2967S));
   	}
         int localIp65504P2967LCounter = -1;
         public boolean isIp65504P2967LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2967LCounter != sharedCounter;
            localIp65504P2967LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2967_L_LEN = 2;
  	/**
	 * serializeIp65504P2967L
	 */
	protected void serializeIp65504P2967L(short ip65504P2967L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2967L,IP_65504_P_2967_L_LEN)
                  ,beginIp65504P2967L
                  ,IP_65504_P_2967_L_LEN
                 );
            localIp65504P2967LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2967LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2967L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2967L() {	 
			return (getShort(beginIp65504P2967L));
   	}
         int localIp65504P2968SCounter = -1;
         public boolean isIp65504P2968SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2968SCounter != sharedCounter;
            localIp65504P2968SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2968_S_LEN = 2;
  	/**
	 * serializeIp65504P2968S
	 */
	protected void serializeIp65504P2968S(short ip65504P2968S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2968S,IP_65504_P_2968_S_LEN)
                  ,beginIp65504P2968S
                  ,IP_65504_P_2968_S_LEN
                 );
            localIp65504P2968SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2968SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2968S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2968S() {	 
			return (getShort(beginIp65504P2968S));
   	}
         int localIp65504P2968LCounter = -1;
         public boolean isIp65504P2968LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2968LCounter != sharedCounter;
            localIp65504P2968LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2968_L_LEN = 2;
  	/**
	 * serializeIp65504P2968L
	 */
	protected void serializeIp65504P2968L(short ip65504P2968L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2968L,IP_65504_P_2968_L_LEN)
                  ,beginIp65504P2968L
                  ,IP_65504_P_2968_L_LEN
                 );
            localIp65504P2968LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2968LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2968L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2968L() {	 
			return (getShort(beginIp65504P2968L));
   	}
         int localIp65504P2969SCounter = -1;
         public boolean isIp65504P2969SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2969SCounter != sharedCounter;
            localIp65504P2969SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2969_S_LEN = 2;
  	/**
	 * serializeIp65504P2969S
	 */
	protected void serializeIp65504P2969S(short ip65504P2969S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2969S,IP_65504_P_2969_S_LEN)
                  ,beginIp65504P2969S
                  ,IP_65504_P_2969_S_LEN
                 );
            localIp65504P2969SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2969SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2969S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2969S() {	 
			return (getShort(beginIp65504P2969S));
   	}
         int localIp65504P2969LCounter = -1;
         public boolean isIp65504P2969LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2969LCounter != sharedCounter;
            localIp65504P2969LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2969_L_LEN = 2;
  	/**
	 * serializeIp65504P2969L
	 */
	protected void serializeIp65504P2969L(short ip65504P2969L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2969L,IP_65504_P_2969_L_LEN)
                  ,beginIp65504P2969L
                  ,IP_65504_P_2969_L_LEN
                 );
            localIp65504P2969LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2969LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2969L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2969L() {	 
			return (getShort(beginIp65504P2969L));
   	}
         int localIp65504P2970SCounter = -1;
         public boolean isIp65504P2970SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2970SCounter != sharedCounter;
            localIp65504P2970SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2970_S_LEN = 2;
  	/**
	 * serializeIp65504P2970S
	 */
	protected void serializeIp65504P2970S(short ip65504P2970S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2970S,IP_65504_P_2970_S_LEN)
                  ,beginIp65504P2970S
                  ,IP_65504_P_2970_S_LEN
                 );
            localIp65504P2970SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2970SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2970S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2970S() {	 
			return (getShort(beginIp65504P2970S));
   	}
         int localIp65504P2970LCounter = -1;
         public boolean isIp65504P2970LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2970LCounter != sharedCounter;
            localIp65504P2970LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2970_L_LEN = 2;
  	/**
	 * serializeIp65504P2970L
	 */
	protected void serializeIp65504P2970L(short ip65504P2970L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2970L,IP_65504_P_2970_L_LEN)
                  ,beginIp65504P2970L
                  ,IP_65504_P_2970_L_LEN
                 );
            localIp65504P2970LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2970LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2970L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2970L() {	 
			return (getShort(beginIp65504P2970L));
   	}
         int localIp65504P2971SCounter = -1;
         public boolean isIp65504P2971SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2971SCounter != sharedCounter;
            localIp65504P2971SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2971_S_LEN = 2;
  	/**
	 * serializeIp65504P2971S
	 */
	protected void serializeIp65504P2971S(short ip65504P2971S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2971S,IP_65504_P_2971_S_LEN)
                  ,beginIp65504P2971S
                  ,IP_65504_P_2971_S_LEN
                 );
            localIp65504P2971SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2971SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2971S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2971S() {	 
			return (getShort(beginIp65504P2971S));
   	}
         int localIp65504P2971LCounter = -1;
         public boolean isIp65504P2971LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2971LCounter != sharedCounter;
            localIp65504P2971LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2971_L_LEN = 2;
  	/**
	 * serializeIp65504P2971L
	 */
	protected void serializeIp65504P2971L(short ip65504P2971L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2971L,IP_65504_P_2971_L_LEN)
                  ,beginIp65504P2971L
                  ,IP_65504_P_2971_L_LEN
                 );
            localIp65504P2971LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2971LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2971L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2971L() {	 
			return (getShort(beginIp65504P2971L));
   	}
         int localIp65504P2972SCounter = -1;
         public boolean isIp65504P2972SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2972SCounter != sharedCounter;
            localIp65504P2972SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2972_S_LEN = 2;
  	/**
	 * serializeIp65504P2972S
	 */
	protected void serializeIp65504P2972S(short ip65504P2972S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2972S,IP_65504_P_2972_S_LEN)
                  ,beginIp65504P2972S
                  ,IP_65504_P_2972_S_LEN
                 );
            localIp65504P2972SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2972SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2972S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2972S() {	 
			return (getShort(beginIp65504P2972S));
   	}
         int localIp65504P2972LCounter = -1;
         public boolean isIp65504P2972LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2972LCounter != sharedCounter;
            localIp65504P2972LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2972_L_LEN = 2;
  	/**
	 * serializeIp65504P2972L
	 */
	protected void serializeIp65504P2972L(short ip65504P2972L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2972L,IP_65504_P_2972_L_LEN)
                  ,beginIp65504P2972L
                  ,IP_65504_P_2972_L_LEN
                 );
            localIp65504P2972LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2972LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2972L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2972L() {	 
			return (getShort(beginIp65504P2972L));
   	}
         int localIp65504P2973SCounter = -1;
         public boolean isIp65504P2973SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2973SCounter != sharedCounter;
            localIp65504P2973SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2973_S_LEN = 2;
  	/**
	 * serializeIp65504P2973S
	 */
	protected void serializeIp65504P2973S(short ip65504P2973S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2973S,IP_65504_P_2973_S_LEN)
                  ,beginIp65504P2973S
                  ,IP_65504_P_2973_S_LEN
                 );
            localIp65504P2973SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2973SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2973S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2973S() {	 
			return (getShort(beginIp65504P2973S));
   	}
         int localIp65504P2973LCounter = -1;
         public boolean isIp65504P2973LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2973LCounter != sharedCounter;
            localIp65504P2973LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2973_L_LEN = 2;
  	/**
	 * serializeIp65504P2973L
	 */
	protected void serializeIp65504P2973L(short ip65504P2973L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2973L,IP_65504_P_2973_L_LEN)
                  ,beginIp65504P2973L
                  ,IP_65504_P_2973_L_LEN
                 );
            localIp65504P2973LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2973LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2973L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2973L() {	 
			return (getShort(beginIp65504P2973L));
   	}
         int localIp65504P2974SCounter = -1;
         public boolean isIp65504P2974SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2974SCounter != sharedCounter;
            localIp65504P2974SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2974_S_LEN = 2;
  	/**
	 * serializeIp65504P2974S
	 */
	protected void serializeIp65504P2974S(short ip65504P2974S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2974S,IP_65504_P_2974_S_LEN)
                  ,beginIp65504P2974S
                  ,IP_65504_P_2974_S_LEN
                 );
            localIp65504P2974SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2974SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2974S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2974S() {	 
			return (getShort(beginIp65504P2974S));
   	}
         int localIp65504P2974LCounter = -1;
         public boolean isIp65504P2974LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2974LCounter != sharedCounter;
            localIp65504P2974LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2974_L_LEN = 2;
  	/**
	 * serializeIp65504P2974L
	 */
	protected void serializeIp65504P2974L(short ip65504P2974L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2974L,IP_65504_P_2974_L_LEN)
                  ,beginIp65504P2974L
                  ,IP_65504_P_2974_L_LEN
                 );
            localIp65504P2974LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2974LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2974L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2974L() {	 
			return (getShort(beginIp65504P2974L));
   	}
         int localIp65504P2975SCounter = -1;
         public boolean isIp65504P2975SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2975SCounter != sharedCounter;
            localIp65504P2975SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2975_S_LEN = 2;
  	/**
	 * serializeIp65504P2975S
	 */
	protected void serializeIp65504P2975S(short ip65504P2975S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2975S,IP_65504_P_2975_S_LEN)
                  ,beginIp65504P2975S
                  ,IP_65504_P_2975_S_LEN
                 );
            localIp65504P2975SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2975SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2975S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2975S() {	 
			return (getShort(beginIp65504P2975S));
   	}
         int localIp65504P2975LCounter = -1;
         public boolean isIp65504P2975LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2975LCounter != sharedCounter;
            localIp65504P2975LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2975_L_LEN = 2;
  	/**
	 * serializeIp65504P2975L
	 */
	protected void serializeIp65504P2975L(short ip65504P2975L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2975L,IP_65504_P_2975_L_LEN)
                  ,beginIp65504P2975L
                  ,IP_65504_P_2975_L_LEN
                 );
            localIp65504P2975LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2975LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2975L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2975L() {	 
			return (getShort(beginIp65504P2975L));
   	}
         int localIp65504P2976SCounter = -1;
         public boolean isIp65504P2976SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2976SCounter != sharedCounter;
            localIp65504P2976SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2976_S_LEN = 2;
  	/**
	 * serializeIp65504P2976S
	 */
	protected void serializeIp65504P2976S(short ip65504P2976S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2976S,IP_65504_P_2976_S_LEN)
                  ,beginIp65504P2976S
                  ,IP_65504_P_2976_S_LEN
                 );
            localIp65504P2976SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2976SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2976S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2976S() {	 
			return (getShort(beginIp65504P2976S));
   	}
         int localIp65504P2976LCounter = -1;
         public boolean isIp65504P2976LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2976LCounter != sharedCounter;
            localIp65504P2976LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2976_L_LEN = 2;
  	/**
	 * serializeIp65504P2976L
	 */
	protected void serializeIp65504P2976L(short ip65504P2976L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2976L,IP_65504_P_2976_L_LEN)
                  ,beginIp65504P2976L
                  ,IP_65504_P_2976_L_LEN
                 );
            localIp65504P2976LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2976LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2976L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2976L() {	 
			return (getShort(beginIp65504P2976L));
   	}




}
  
