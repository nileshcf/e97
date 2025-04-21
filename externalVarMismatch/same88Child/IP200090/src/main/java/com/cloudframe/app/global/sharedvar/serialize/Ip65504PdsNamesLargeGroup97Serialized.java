package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup97Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:08. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup97Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup97Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_97_LENGTH = 192;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P2977S;
            protected  int beginIp65504P2977L;
            protected  int beginIp65504P2978S;
            protected  int beginIp65504P2978L;
            protected  int beginIp65504P2979S;
            protected  int beginIp65504P2979L;
            protected  int beginIp65504P2980S;
            protected  int beginIp65504P2980L;
            protected  int beginIp65504P2981S;
            protected  int beginIp65504P2981L;
            protected  int beginIp65504P2982S;
            protected  int beginIp65504P2982L;
            protected  int beginIp65504P2983S;
            protected  int beginIp65504P2983L;
            protected  int beginIp65504P2984S;
            protected  int beginIp65504P2984L;
            protected  int beginIp65504P2985S;
            protected  int beginIp65504P2985L;
            protected  int beginIp65504P2986S;
            protected  int beginIp65504P2986L;
            protected  int beginIp65504P2987S;
            protected  int beginIp65504P2987L;
            protected  int beginIp65504P2988S;
            protected  int beginIp65504P2988L;
            protected  int beginIp65504P2989S;
            protected  int beginIp65504P2989L;
            protected  int beginIp65504P2990S;
            protected  int beginIp65504P2990L;
            protected  int beginIp65504P2991S;
            protected  int beginIp65504P2991L;
            protected  int beginIp65504P2992S;
            protected  int beginIp65504P2992L;
            protected  int beginIp65504P2993S;
            protected  int beginIp65504P2993L;
            protected  int beginIp65504P2994S;
            protected  int beginIp65504P2994L;
            protected  int beginIp65504P2995S;
            protected  int beginIp65504P2995L;
            protected  int beginIp65504P2996S;
            protected  int beginIp65504P2996L;
            protected  int beginIp65504P2997S;
            protected  int beginIp65504P2997L;
            protected  int beginIp65504P2998S;
            protected  int beginIp65504P2998L;
            protected  int beginIp65504P2999S;
            protected  int beginIp65504P2999L;
            protected  int beginIp65504P3000S;
            protected  int beginIp65504P3000L;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup97Serialized
	**/
    public Ip65504PdsNamesLargeGroup97Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup97Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup97Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup97Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,23804); // serialize this field at offset 23804 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup97Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 23804 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup97Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_97_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P2977S = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P2977L = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P2978S = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P2978L = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P2979S = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P2979L = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P2980S = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P2980L = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P2981S = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P2981L = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P2982S = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P2982L = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P2983S = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P2983L = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P2984S = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P2984L = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P2985S = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P2985L = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P2986S = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P2986L = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P2987S = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P2987L = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P2988S = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P2988L = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P2989S = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P2989L = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P2990S = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P2990L = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P2991S = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P2991L = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P2992S = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P2992L = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P2993S = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P2993L = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P2994S = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P2994L = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P2995S = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P2995L = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P2996S = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P2996L = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P2997S = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P2997L = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P2998S = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P2998L = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P2999S = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P2999L = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P3000S = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P3000L = getStartOffset() + 190;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P2977SCounter = -1;
         public boolean isIp65504P2977SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2977SCounter != sharedCounter;
            localIp65504P2977SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2977_S_LEN = 2;
  	/**
	 * serializeIp65504P2977S
	 */
	protected void serializeIp65504P2977S(short ip65504P2977S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2977S,IP_65504_P_2977_S_LEN)
                  ,beginIp65504P2977S
                  ,IP_65504_P_2977_S_LEN
                 );
            localIp65504P2977SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2977SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2977S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2977S() {	 
			return (getShort(beginIp65504P2977S));
   	}
         int localIp65504P2977LCounter = -1;
         public boolean isIp65504P2977LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2977LCounter != sharedCounter;
            localIp65504P2977LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2977_L_LEN = 2;
  	/**
	 * serializeIp65504P2977L
	 */
	protected void serializeIp65504P2977L(short ip65504P2977L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2977L,IP_65504_P_2977_L_LEN)
                  ,beginIp65504P2977L
                  ,IP_65504_P_2977_L_LEN
                 );
            localIp65504P2977LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2977LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2977L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2977L() {	 
			return (getShort(beginIp65504P2977L));
   	}
         int localIp65504P2978SCounter = -1;
         public boolean isIp65504P2978SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2978SCounter != sharedCounter;
            localIp65504P2978SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2978_S_LEN = 2;
  	/**
	 * serializeIp65504P2978S
	 */
	protected void serializeIp65504P2978S(short ip65504P2978S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2978S,IP_65504_P_2978_S_LEN)
                  ,beginIp65504P2978S
                  ,IP_65504_P_2978_S_LEN
                 );
            localIp65504P2978SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2978SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2978S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2978S() {	 
			return (getShort(beginIp65504P2978S));
   	}
         int localIp65504P2978LCounter = -1;
         public boolean isIp65504P2978LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2978LCounter != sharedCounter;
            localIp65504P2978LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2978_L_LEN = 2;
  	/**
	 * serializeIp65504P2978L
	 */
	protected void serializeIp65504P2978L(short ip65504P2978L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2978L,IP_65504_P_2978_L_LEN)
                  ,beginIp65504P2978L
                  ,IP_65504_P_2978_L_LEN
                 );
            localIp65504P2978LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2978LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2978L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2978L() {	 
			return (getShort(beginIp65504P2978L));
   	}
         int localIp65504P2979SCounter = -1;
         public boolean isIp65504P2979SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2979SCounter != sharedCounter;
            localIp65504P2979SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2979_S_LEN = 2;
  	/**
	 * serializeIp65504P2979S
	 */
	protected void serializeIp65504P2979S(short ip65504P2979S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2979S,IP_65504_P_2979_S_LEN)
                  ,beginIp65504P2979S
                  ,IP_65504_P_2979_S_LEN
                 );
            localIp65504P2979SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2979SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2979S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2979S() {	 
			return (getShort(beginIp65504P2979S));
   	}
         int localIp65504P2979LCounter = -1;
         public boolean isIp65504P2979LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2979LCounter != sharedCounter;
            localIp65504P2979LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2979_L_LEN = 2;
  	/**
	 * serializeIp65504P2979L
	 */
	protected void serializeIp65504P2979L(short ip65504P2979L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2979L,IP_65504_P_2979_L_LEN)
                  ,beginIp65504P2979L
                  ,IP_65504_P_2979_L_LEN
                 );
            localIp65504P2979LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2979LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2979L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2979L() {	 
			return (getShort(beginIp65504P2979L));
   	}
         int localIp65504P2980SCounter = -1;
         public boolean isIp65504P2980SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2980SCounter != sharedCounter;
            localIp65504P2980SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2980_S_LEN = 2;
  	/**
	 * serializeIp65504P2980S
	 */
	protected void serializeIp65504P2980S(short ip65504P2980S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2980S,IP_65504_P_2980_S_LEN)
                  ,beginIp65504P2980S
                  ,IP_65504_P_2980_S_LEN
                 );
            localIp65504P2980SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2980SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2980S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2980S() {	 
			return (getShort(beginIp65504P2980S));
   	}
         int localIp65504P2980LCounter = -1;
         public boolean isIp65504P2980LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2980LCounter != sharedCounter;
            localIp65504P2980LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2980_L_LEN = 2;
  	/**
	 * serializeIp65504P2980L
	 */
	protected void serializeIp65504P2980L(short ip65504P2980L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2980L,IP_65504_P_2980_L_LEN)
                  ,beginIp65504P2980L
                  ,IP_65504_P_2980_L_LEN
                 );
            localIp65504P2980LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2980LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2980L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2980L() {	 
			return (getShort(beginIp65504P2980L));
   	}
         int localIp65504P2981SCounter = -1;
         public boolean isIp65504P2981SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2981SCounter != sharedCounter;
            localIp65504P2981SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2981_S_LEN = 2;
  	/**
	 * serializeIp65504P2981S
	 */
	protected void serializeIp65504P2981S(short ip65504P2981S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2981S,IP_65504_P_2981_S_LEN)
                  ,beginIp65504P2981S
                  ,IP_65504_P_2981_S_LEN
                 );
            localIp65504P2981SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2981SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2981S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2981S() {	 
			return (getShort(beginIp65504P2981S));
   	}
         int localIp65504P2981LCounter = -1;
         public boolean isIp65504P2981LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2981LCounter != sharedCounter;
            localIp65504P2981LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2981_L_LEN = 2;
  	/**
	 * serializeIp65504P2981L
	 */
	protected void serializeIp65504P2981L(short ip65504P2981L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2981L,IP_65504_P_2981_L_LEN)
                  ,beginIp65504P2981L
                  ,IP_65504_P_2981_L_LEN
                 );
            localIp65504P2981LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2981LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2981L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2981L() {	 
			return (getShort(beginIp65504P2981L));
   	}
         int localIp65504P2982SCounter = -1;
         public boolean isIp65504P2982SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2982SCounter != sharedCounter;
            localIp65504P2982SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2982_S_LEN = 2;
  	/**
	 * serializeIp65504P2982S
	 */
	protected void serializeIp65504P2982S(short ip65504P2982S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2982S,IP_65504_P_2982_S_LEN)
                  ,beginIp65504P2982S
                  ,IP_65504_P_2982_S_LEN
                 );
            localIp65504P2982SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2982SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2982S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2982S() {	 
			return (getShort(beginIp65504P2982S));
   	}
         int localIp65504P2982LCounter = -1;
         public boolean isIp65504P2982LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2982LCounter != sharedCounter;
            localIp65504P2982LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2982_L_LEN = 2;
  	/**
	 * serializeIp65504P2982L
	 */
	protected void serializeIp65504P2982L(short ip65504P2982L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2982L,IP_65504_P_2982_L_LEN)
                  ,beginIp65504P2982L
                  ,IP_65504_P_2982_L_LEN
                 );
            localIp65504P2982LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2982LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2982L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2982L() {	 
			return (getShort(beginIp65504P2982L));
   	}
         int localIp65504P2983SCounter = -1;
         public boolean isIp65504P2983SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2983SCounter != sharedCounter;
            localIp65504P2983SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2983_S_LEN = 2;
  	/**
	 * serializeIp65504P2983S
	 */
	protected void serializeIp65504P2983S(short ip65504P2983S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2983S,IP_65504_P_2983_S_LEN)
                  ,beginIp65504P2983S
                  ,IP_65504_P_2983_S_LEN
                 );
            localIp65504P2983SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2983SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2983S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2983S() {	 
			return (getShort(beginIp65504P2983S));
   	}
         int localIp65504P2983LCounter = -1;
         public boolean isIp65504P2983LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2983LCounter != sharedCounter;
            localIp65504P2983LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2983_L_LEN = 2;
  	/**
	 * serializeIp65504P2983L
	 */
	protected void serializeIp65504P2983L(short ip65504P2983L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2983L,IP_65504_P_2983_L_LEN)
                  ,beginIp65504P2983L
                  ,IP_65504_P_2983_L_LEN
                 );
            localIp65504P2983LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2983LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2983L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2983L() {	 
			return (getShort(beginIp65504P2983L));
   	}
         int localIp65504P2984SCounter = -1;
         public boolean isIp65504P2984SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2984SCounter != sharedCounter;
            localIp65504P2984SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2984_S_LEN = 2;
  	/**
	 * serializeIp65504P2984S
	 */
	protected void serializeIp65504P2984S(short ip65504P2984S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2984S,IP_65504_P_2984_S_LEN)
                  ,beginIp65504P2984S
                  ,IP_65504_P_2984_S_LEN
                 );
            localIp65504P2984SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2984SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2984S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2984S() {	 
			return (getShort(beginIp65504P2984S));
   	}
         int localIp65504P2984LCounter = -1;
         public boolean isIp65504P2984LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2984LCounter != sharedCounter;
            localIp65504P2984LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2984_L_LEN = 2;
  	/**
	 * serializeIp65504P2984L
	 */
	protected void serializeIp65504P2984L(short ip65504P2984L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2984L,IP_65504_P_2984_L_LEN)
                  ,beginIp65504P2984L
                  ,IP_65504_P_2984_L_LEN
                 );
            localIp65504P2984LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2984LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2984L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2984L() {	 
			return (getShort(beginIp65504P2984L));
   	}
         int localIp65504P2985SCounter = -1;
         public boolean isIp65504P2985SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2985SCounter != sharedCounter;
            localIp65504P2985SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2985_S_LEN = 2;
  	/**
	 * serializeIp65504P2985S
	 */
	protected void serializeIp65504P2985S(short ip65504P2985S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2985S,IP_65504_P_2985_S_LEN)
                  ,beginIp65504P2985S
                  ,IP_65504_P_2985_S_LEN
                 );
            localIp65504P2985SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2985SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2985S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2985S() {	 
			return (getShort(beginIp65504P2985S));
   	}
         int localIp65504P2985LCounter = -1;
         public boolean isIp65504P2985LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2985LCounter != sharedCounter;
            localIp65504P2985LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2985_L_LEN = 2;
  	/**
	 * serializeIp65504P2985L
	 */
	protected void serializeIp65504P2985L(short ip65504P2985L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2985L,IP_65504_P_2985_L_LEN)
                  ,beginIp65504P2985L
                  ,IP_65504_P_2985_L_LEN
                 );
            localIp65504P2985LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2985LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2985L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2985L() {	 
			return (getShort(beginIp65504P2985L));
   	}
         int localIp65504P2986SCounter = -1;
         public boolean isIp65504P2986SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2986SCounter != sharedCounter;
            localIp65504P2986SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2986_S_LEN = 2;
  	/**
	 * serializeIp65504P2986S
	 */
	protected void serializeIp65504P2986S(short ip65504P2986S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2986S,IP_65504_P_2986_S_LEN)
                  ,beginIp65504P2986S
                  ,IP_65504_P_2986_S_LEN
                 );
            localIp65504P2986SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2986SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2986S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2986S() {	 
			return (getShort(beginIp65504P2986S));
   	}
         int localIp65504P2986LCounter = -1;
         public boolean isIp65504P2986LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2986LCounter != sharedCounter;
            localIp65504P2986LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2986_L_LEN = 2;
  	/**
	 * serializeIp65504P2986L
	 */
	protected void serializeIp65504P2986L(short ip65504P2986L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2986L,IP_65504_P_2986_L_LEN)
                  ,beginIp65504P2986L
                  ,IP_65504_P_2986_L_LEN
                 );
            localIp65504P2986LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2986LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2986L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2986L() {	 
			return (getShort(beginIp65504P2986L));
   	}
         int localIp65504P2987SCounter = -1;
         public boolean isIp65504P2987SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2987SCounter != sharedCounter;
            localIp65504P2987SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2987_S_LEN = 2;
  	/**
	 * serializeIp65504P2987S
	 */
	protected void serializeIp65504P2987S(short ip65504P2987S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2987S,IP_65504_P_2987_S_LEN)
                  ,beginIp65504P2987S
                  ,IP_65504_P_2987_S_LEN
                 );
            localIp65504P2987SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2987SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2987S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2987S() {	 
			return (getShort(beginIp65504P2987S));
   	}
         int localIp65504P2987LCounter = -1;
         public boolean isIp65504P2987LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2987LCounter != sharedCounter;
            localIp65504P2987LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2987_L_LEN = 2;
  	/**
	 * serializeIp65504P2987L
	 */
	protected void serializeIp65504P2987L(short ip65504P2987L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2987L,IP_65504_P_2987_L_LEN)
                  ,beginIp65504P2987L
                  ,IP_65504_P_2987_L_LEN
                 );
            localIp65504P2987LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2987LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2987L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2987L() {	 
			return (getShort(beginIp65504P2987L));
   	}
         int localIp65504P2988SCounter = -1;
         public boolean isIp65504P2988SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2988SCounter != sharedCounter;
            localIp65504P2988SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2988_S_LEN = 2;
  	/**
	 * serializeIp65504P2988S
	 */
	protected void serializeIp65504P2988S(short ip65504P2988S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2988S,IP_65504_P_2988_S_LEN)
                  ,beginIp65504P2988S
                  ,IP_65504_P_2988_S_LEN
                 );
            localIp65504P2988SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2988SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2988S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2988S() {	 
			return (getShort(beginIp65504P2988S));
   	}
         int localIp65504P2988LCounter = -1;
         public boolean isIp65504P2988LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2988LCounter != sharedCounter;
            localIp65504P2988LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2988_L_LEN = 2;
  	/**
	 * serializeIp65504P2988L
	 */
	protected void serializeIp65504P2988L(short ip65504P2988L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2988L,IP_65504_P_2988_L_LEN)
                  ,beginIp65504P2988L
                  ,IP_65504_P_2988_L_LEN
                 );
            localIp65504P2988LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2988LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2988L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2988L() {	 
			return (getShort(beginIp65504P2988L));
   	}
         int localIp65504P2989SCounter = -1;
         public boolean isIp65504P2989SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2989SCounter != sharedCounter;
            localIp65504P2989SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2989_S_LEN = 2;
  	/**
	 * serializeIp65504P2989S
	 */
	protected void serializeIp65504P2989S(short ip65504P2989S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2989S,IP_65504_P_2989_S_LEN)
                  ,beginIp65504P2989S
                  ,IP_65504_P_2989_S_LEN
                 );
            localIp65504P2989SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2989SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2989S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2989S() {	 
			return (getShort(beginIp65504P2989S));
   	}
         int localIp65504P2989LCounter = -1;
         public boolean isIp65504P2989LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2989LCounter != sharedCounter;
            localIp65504P2989LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2989_L_LEN = 2;
  	/**
	 * serializeIp65504P2989L
	 */
	protected void serializeIp65504P2989L(short ip65504P2989L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2989L,IP_65504_P_2989_L_LEN)
                  ,beginIp65504P2989L
                  ,IP_65504_P_2989_L_LEN
                 );
            localIp65504P2989LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2989LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2989L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2989L() {	 
			return (getShort(beginIp65504P2989L));
   	}
         int localIp65504P2990SCounter = -1;
         public boolean isIp65504P2990SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2990SCounter != sharedCounter;
            localIp65504P2990SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2990_S_LEN = 2;
  	/**
	 * serializeIp65504P2990S
	 */
	protected void serializeIp65504P2990S(short ip65504P2990S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2990S,IP_65504_P_2990_S_LEN)
                  ,beginIp65504P2990S
                  ,IP_65504_P_2990_S_LEN
                 );
            localIp65504P2990SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2990SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2990S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2990S() {	 
			return (getShort(beginIp65504P2990S));
   	}
         int localIp65504P2990LCounter = -1;
         public boolean isIp65504P2990LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2990LCounter != sharedCounter;
            localIp65504P2990LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2990_L_LEN = 2;
  	/**
	 * serializeIp65504P2990L
	 */
	protected void serializeIp65504P2990L(short ip65504P2990L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2990L,IP_65504_P_2990_L_LEN)
                  ,beginIp65504P2990L
                  ,IP_65504_P_2990_L_LEN
                 );
            localIp65504P2990LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2990LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2990L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2990L() {	 
			return (getShort(beginIp65504P2990L));
   	}
         int localIp65504P2991SCounter = -1;
         public boolean isIp65504P2991SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2991SCounter != sharedCounter;
            localIp65504P2991SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2991_S_LEN = 2;
  	/**
	 * serializeIp65504P2991S
	 */
	protected void serializeIp65504P2991S(short ip65504P2991S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2991S,IP_65504_P_2991_S_LEN)
                  ,beginIp65504P2991S
                  ,IP_65504_P_2991_S_LEN
                 );
            localIp65504P2991SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2991SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2991S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2991S() {	 
			return (getShort(beginIp65504P2991S));
   	}
         int localIp65504P2991LCounter = -1;
         public boolean isIp65504P2991LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2991LCounter != sharedCounter;
            localIp65504P2991LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2991_L_LEN = 2;
  	/**
	 * serializeIp65504P2991L
	 */
	protected void serializeIp65504P2991L(short ip65504P2991L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2991L,IP_65504_P_2991_L_LEN)
                  ,beginIp65504P2991L
                  ,IP_65504_P_2991_L_LEN
                 );
            localIp65504P2991LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2991LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2991L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2991L() {	 
			return (getShort(beginIp65504P2991L));
   	}
         int localIp65504P2992SCounter = -1;
         public boolean isIp65504P2992SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2992SCounter != sharedCounter;
            localIp65504P2992SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2992_S_LEN = 2;
  	/**
	 * serializeIp65504P2992S
	 */
	protected void serializeIp65504P2992S(short ip65504P2992S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2992S,IP_65504_P_2992_S_LEN)
                  ,beginIp65504P2992S
                  ,IP_65504_P_2992_S_LEN
                 );
            localIp65504P2992SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2992SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2992S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2992S() {	 
			return (getShort(beginIp65504P2992S));
   	}
         int localIp65504P2992LCounter = -1;
         public boolean isIp65504P2992LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2992LCounter != sharedCounter;
            localIp65504P2992LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2992_L_LEN = 2;
  	/**
	 * serializeIp65504P2992L
	 */
	protected void serializeIp65504P2992L(short ip65504P2992L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2992L,IP_65504_P_2992_L_LEN)
                  ,beginIp65504P2992L
                  ,IP_65504_P_2992_L_LEN
                 );
            localIp65504P2992LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2992LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2992L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2992L() {	 
			return (getShort(beginIp65504P2992L));
   	}
         int localIp65504P2993SCounter = -1;
         public boolean isIp65504P2993SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2993SCounter != sharedCounter;
            localIp65504P2993SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2993_S_LEN = 2;
  	/**
	 * serializeIp65504P2993S
	 */
	protected void serializeIp65504P2993S(short ip65504P2993S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2993S,IP_65504_P_2993_S_LEN)
                  ,beginIp65504P2993S
                  ,IP_65504_P_2993_S_LEN
                 );
            localIp65504P2993SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2993SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2993S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2993S() {	 
			return (getShort(beginIp65504P2993S));
   	}
         int localIp65504P2993LCounter = -1;
         public boolean isIp65504P2993LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2993LCounter != sharedCounter;
            localIp65504P2993LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2993_L_LEN = 2;
  	/**
	 * serializeIp65504P2993L
	 */
	protected void serializeIp65504P2993L(short ip65504P2993L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2993L,IP_65504_P_2993_L_LEN)
                  ,beginIp65504P2993L
                  ,IP_65504_P_2993_L_LEN
                 );
            localIp65504P2993LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2993LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2993L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2993L() {	 
			return (getShort(beginIp65504P2993L));
   	}
         int localIp65504P2994SCounter = -1;
         public boolean isIp65504P2994SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2994SCounter != sharedCounter;
            localIp65504P2994SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2994_S_LEN = 2;
  	/**
	 * serializeIp65504P2994S
	 */
	protected void serializeIp65504P2994S(short ip65504P2994S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2994S,IP_65504_P_2994_S_LEN)
                  ,beginIp65504P2994S
                  ,IP_65504_P_2994_S_LEN
                 );
            localIp65504P2994SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2994SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2994S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2994S() {	 
			return (getShort(beginIp65504P2994S));
   	}
         int localIp65504P2994LCounter = -1;
         public boolean isIp65504P2994LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2994LCounter != sharedCounter;
            localIp65504P2994LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2994_L_LEN = 2;
  	/**
	 * serializeIp65504P2994L
	 */
	protected void serializeIp65504P2994L(short ip65504P2994L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2994L,IP_65504_P_2994_L_LEN)
                  ,beginIp65504P2994L
                  ,IP_65504_P_2994_L_LEN
                 );
            localIp65504P2994LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2994LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2994L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2994L() {	 
			return (getShort(beginIp65504P2994L));
   	}
         int localIp65504P2995SCounter = -1;
         public boolean isIp65504P2995SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2995SCounter != sharedCounter;
            localIp65504P2995SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2995_S_LEN = 2;
  	/**
	 * serializeIp65504P2995S
	 */
	protected void serializeIp65504P2995S(short ip65504P2995S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2995S,IP_65504_P_2995_S_LEN)
                  ,beginIp65504P2995S
                  ,IP_65504_P_2995_S_LEN
                 );
            localIp65504P2995SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2995SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2995S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2995S() {	 
			return (getShort(beginIp65504P2995S));
   	}
         int localIp65504P2995LCounter = -1;
         public boolean isIp65504P2995LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2995LCounter != sharedCounter;
            localIp65504P2995LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2995_L_LEN = 2;
  	/**
	 * serializeIp65504P2995L
	 */
	protected void serializeIp65504P2995L(short ip65504P2995L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2995L,IP_65504_P_2995_L_LEN)
                  ,beginIp65504P2995L
                  ,IP_65504_P_2995_L_LEN
                 );
            localIp65504P2995LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2995LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2995L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2995L() {	 
			return (getShort(beginIp65504P2995L));
   	}
         int localIp65504P2996SCounter = -1;
         public boolean isIp65504P2996SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2996SCounter != sharedCounter;
            localIp65504P2996SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2996_S_LEN = 2;
  	/**
	 * serializeIp65504P2996S
	 */
	protected void serializeIp65504P2996S(short ip65504P2996S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2996S,IP_65504_P_2996_S_LEN)
                  ,beginIp65504P2996S
                  ,IP_65504_P_2996_S_LEN
                 );
            localIp65504P2996SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2996SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2996S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2996S() {	 
			return (getShort(beginIp65504P2996S));
   	}
         int localIp65504P2996LCounter = -1;
         public boolean isIp65504P2996LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2996LCounter != sharedCounter;
            localIp65504P2996LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2996_L_LEN = 2;
  	/**
	 * serializeIp65504P2996L
	 */
	protected void serializeIp65504P2996L(short ip65504P2996L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2996L,IP_65504_P_2996_L_LEN)
                  ,beginIp65504P2996L
                  ,IP_65504_P_2996_L_LEN
                 );
            localIp65504P2996LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2996LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2996L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2996L() {	 
			return (getShort(beginIp65504P2996L));
   	}
         int localIp65504P2997SCounter = -1;
         public boolean isIp65504P2997SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2997SCounter != sharedCounter;
            localIp65504P2997SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2997_S_LEN = 2;
  	/**
	 * serializeIp65504P2997S
	 */
	protected void serializeIp65504P2997S(short ip65504P2997S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2997S,IP_65504_P_2997_S_LEN)
                  ,beginIp65504P2997S
                  ,IP_65504_P_2997_S_LEN
                 );
            localIp65504P2997SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2997SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2997S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2997S() {	 
			return (getShort(beginIp65504P2997S));
   	}
         int localIp65504P2997LCounter = -1;
         public boolean isIp65504P2997LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2997LCounter != sharedCounter;
            localIp65504P2997LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2997_L_LEN = 2;
  	/**
	 * serializeIp65504P2997L
	 */
	protected void serializeIp65504P2997L(short ip65504P2997L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2997L,IP_65504_P_2997_L_LEN)
                  ,beginIp65504P2997L
                  ,IP_65504_P_2997_L_LEN
                 );
            localIp65504P2997LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2997LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2997L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2997L() {	 
			return (getShort(beginIp65504P2997L));
   	}
         int localIp65504P2998SCounter = -1;
         public boolean isIp65504P2998SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2998SCounter != sharedCounter;
            localIp65504P2998SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2998_S_LEN = 2;
  	/**
	 * serializeIp65504P2998S
	 */
	protected void serializeIp65504P2998S(short ip65504P2998S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2998S,IP_65504_P_2998_S_LEN)
                  ,beginIp65504P2998S
                  ,IP_65504_P_2998_S_LEN
                 );
            localIp65504P2998SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2998SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2998S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2998S() {	 
			return (getShort(beginIp65504P2998S));
   	}
         int localIp65504P2998LCounter = -1;
         public boolean isIp65504P2998LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2998LCounter != sharedCounter;
            localIp65504P2998LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2998_L_LEN = 2;
  	/**
	 * serializeIp65504P2998L
	 */
	protected void serializeIp65504P2998L(short ip65504P2998L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2998L,IP_65504_P_2998_L_LEN)
                  ,beginIp65504P2998L
                  ,IP_65504_P_2998_L_LEN
                 );
            localIp65504P2998LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2998LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2998L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2998L() {	 
			return (getShort(beginIp65504P2998L));
   	}
         int localIp65504P2999SCounter = -1;
         public boolean isIp65504P2999SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2999SCounter != sharedCounter;
            localIp65504P2999SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2999_S_LEN = 2;
  	/**
	 * serializeIp65504P2999S
	 */
	protected void serializeIp65504P2999S(short ip65504P2999S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2999S,IP_65504_P_2999_S_LEN)
                  ,beginIp65504P2999S
                  ,IP_65504_P_2999_S_LEN
                 );
            localIp65504P2999SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2999SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2999S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2999S() {	 
			return (getShort(beginIp65504P2999S));
   	}
         int localIp65504P2999LCounter = -1;
         public boolean isIp65504P2999LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2999LCounter != sharedCounter;
            localIp65504P2999LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2999_L_LEN = 2;
  	/**
	 * serializeIp65504P2999L
	 */
	protected void serializeIp65504P2999L(short ip65504P2999L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2999L,IP_65504_P_2999_L_LEN)
                  ,beginIp65504P2999L
                  ,IP_65504_P_2999_L_LEN
                 );
            localIp65504P2999LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2999LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2999L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2999L() {	 
			return (getShort(beginIp65504P2999L));
   	}
         int localIp65504P3000SCounter = -1;
         public boolean isIp65504P3000SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P3000SCounter != sharedCounter;
            localIp65504P3000SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_3000_S_LEN = 2;
  	/**
	 * serializeIp65504P3000S
	 */
	protected void serializeIp65504P3000S(short ip65504P3000S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P3000S,IP_65504_P_3000_S_LEN)
                  ,beginIp65504P3000S
                  ,IP_65504_P_3000_S_LEN
                 );
            localIp65504P3000SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P3000SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P3000S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P3000S() {	 
			return (getShort(beginIp65504P3000S));
   	}
         int localIp65504P3000LCounter = -1;
         public boolean isIp65504P3000LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P3000LCounter != sharedCounter;
            localIp65504P3000LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_3000_L_LEN = 2;
  	/**
	 * serializeIp65504P3000L
	 */
	protected void serializeIp65504P3000L(short ip65504P3000L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P3000L,IP_65504_P_3000_L_LEN)
                  ,beginIp65504P3000L
                  ,IP_65504_P_3000_L_LEN
                 );
            localIp65504P3000LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P3000LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P3000L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P3000L() {	 
			return (getShort(beginIp65504P3000L));
   	}




}
  
