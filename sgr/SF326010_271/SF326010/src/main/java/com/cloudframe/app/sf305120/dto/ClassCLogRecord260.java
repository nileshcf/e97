package com.cloudframe.app.sf305120.dto;

/**
*  The class ClassCLogRecord260 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class ClassCLogRecord260 extends ClassCLogRecord260Serialized {
   


								@Getter @Setter private short logcMiplogLength260;

						@Getter @Setter private char[] logcClassType260 = new char[2];

						@Getter @Setter private char[] logcMiplogRefNum260 = new char[6];

						@Getter @Setter private char[] logcMiplogBoxId260 = new char[3];

						@Getter @Setter private char[] logcMiplogTime260 = new char[3];

						@Getter @Setter private char[] logcMiplogDate260 = new char[3];
				@Getter @Setter private AdditionalRuc260 additionalRuc260 = new AdditionalRuc260();
				@Getter @Setter private AdditionalRuc260Redefined additionalRuc260Redefined = new AdditionalRuc260Redefined();

						@Getter @Setter private char[] logcServiceType260 = new char[4];

						@Getter @Setter private char[] logcApplRefNo260 = new char[6];


						@Getter @Setter private char[] accountNo260 = new char[16];


						@Getter @Setter private char[] logcAcqMipId260 = new char[3];

						@Getter @Setter private char[] logcIssMipId260 = new char[3];


						@Getter @Setter private char[] logcIsoMessage260 = new char[8000];
	
	/**
	* Constructor for ClassCLogRecord260
	**/
    public ClassCLogRecord260() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getAdditionalRuc260().setParent(this,getStartOffset() + 32);
					getAdditionalRuc260Redefined().setParent(this,getStartOffset() + 32);
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             fillSpace(13)
             , getStartOffset() + 0
             ,13
             );
								setLogcMiplogLength260((short)0);
								setLogcClassType260(fillSpace(2));
								setLogcMiplogRefNum260(fillSpace(6));
								setLogcMiplogBoxId260(fillSpace(3));
								setLogcMiplogTime260(fillSpace(3));
								setLogcMiplogDate260(fillSpace(3));
								setLogcServiceType260(fillSpace(4));
								setLogcApplRefNo260(fillSpace(6));
       replaceValue( // serialize and save the value
             fillSpace(7)
             , getStartOffset() + 123
             ,7
             );
								setAccountNo260(fillSpace(16));
       replaceValue( // serialize and save the value
             pad(98," ".toCharArray(),' ',RIGHT_PAD)
             , getStartOffset() + 146
             ,98
             );
								setLogcAcqMipId260(fillSpace(3));
								setLogcIssMipId260(fillSpace(3));
       replaceValue( // serialize and save the value
             fillSpace(23)
             , getStartOffset() + 250
             ,23
             );
								setLogcIsoMessage260(pad(8000," ".toCharArray(),' ',RIGHT_PAD));
    }





}
  
