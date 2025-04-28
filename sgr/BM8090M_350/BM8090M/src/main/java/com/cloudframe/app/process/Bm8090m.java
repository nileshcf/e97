package com.cloudframe.app.process;

import com.cloudframe.app.bm8090m.Bm8090mCtx.RedGuiPe8090mInCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.ReponTob1200OutCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.SelTratoPe8090mInCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.Particion01InCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.NomOblPe8090mOutCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.TratoPriPe8090mOutCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.SepGioPe8090mInCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.Particion02InCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.ComprimirNombreOutCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.TabOblPe8090mInCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.ParticionEntradaInCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.CatPe8090mMAS6InCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.CasPe8090mMAS6OutCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.Pe8090mTRATO7OutCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.AveLonTitPe8090mOutCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.RestInpDosPe8090mOutCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.NombreTitPe8090mInCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.Pe8090mTRATO4OutCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.TraPerOblPe8090mInCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.RestInpDosPe8090mInCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.TabOblPe8090mOutCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.TratamientoOutCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.RedSegApePe8090mOutCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.PerOPC01OutCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.SelJurPe8090mInCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.Pe8090mOutCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.StringGioTrePe8090mOutCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.MonitoraInCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.ElimPriPerPe8090mOutCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.AlmacenarPe8090mOutCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.StringGioTrePe8090mInCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.VerWtipPe8090mInCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.RedPersoPe8090mOutCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.ParticionEntradaOutCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.TratamientoInCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.CatPe8090mMAS3InCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.PerOutCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.Pe8090mTRATO6OutCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.StringGuiUnoPe8090mInCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.Pe8090mTRATO2InCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.EsFisAlmPe8090mInCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.UnoDosDosPe8090mOutCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.NomOblPe8090mInCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.NombreTitPe8090mOutCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.EsJurAlmPe8090mOutCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.RedNomIniPe8090mOutCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.CasPe8090mMAS3OutCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.MonitoraOutCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.UnoUnoUnoPe8090mOutCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.ComprimirNombreInCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.UnoUnoUnoPe8090mInCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.StringGuiTrePe8090mOutCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.Pe8090mTRATO5OutCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.StringGuiUnoPe8090mOutCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.TraPerJurPe8090mInCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.TraPerOptPe8090mOutCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.AlmacenarPe8090mInCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.PartirTituloOutCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.bm8090m.Bm8090mCtx.Final8000InCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.InvPerActPe8090mInCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.PerOPC01InCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.TratDeDatosInCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.CatPe8090mOutCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.ElimPriPerPe8090mInCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.CatPe8090mMAS6OutCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.BusCaracterEntradaOutCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.Pe8090mTRATO4InCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.Pe8090mTRATO5InCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.CatPe8090mMAS3OutCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.Particion01OutCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.UnoDosUnoPe8090mInCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.InicioOutCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.ConfecTitPe8090mOutCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.UnoUnoDosPe8090mOutCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.BusCaracterEntradaInCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.ReponTpe1200InCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.Pe8090mTRATO3OutCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.TraPerJurPe8090mOutCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.RedGuiPe8090mOutCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.RestInpUnoPe8090mOutCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.ComOutCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.PerOPC02InCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.TraPerOptPe8090mInCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.TraPerFisPe8090mOutCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.CatPe8090mInCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.NomMasPe8090mOutCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.CasPe8090mInCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.UnoDosUnoPe8090mOutCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.TraPerFisPe8090mInCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.Final8000OutCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.RespuestaEntradaInCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.UnoDosDosPe8090mInCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.PerOPC02OutCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.ReponTob1200InCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.PerInCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.FinPerFisPe8090mEntradaInCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.Pe8090mTRATO7InCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.MontarTituloOutCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.EsJurAlmPe8090mInCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.StringGioUnoPe8090mOutCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.RestInpUnoPe8090mInCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.ReponTpe1200OutCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.RedSegApePe8090mInCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.CasPe8090mMAS3InCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.CasPe8090mMAS6InCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.NomMasPe8090mInCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.StringGuiTrePe8090mInCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.TratDeDatosOutCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.TratoPriPe8090mInCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.StringGioUnoPe8090mInCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.PartirTituloInCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.SepGuiPe8090mInCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.RestInpTresPe8090mOutCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.InvPerActPe8090mOutCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.UnoUnoDosPe8090mInCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.EsFisAlmPe8090mOutCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.Pe8090mInCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.EstruTitPe8090mInCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.RestInpTresPe8090mInCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.Particion02OutCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.ComInCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.TraPerOblPe8090mOutCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.bm8090m.Bm8090mCtx.CasPe8090mOutCtx;
import com.cloudframe.app.bm8090m.Bm8090mCtx.RespuestaEntradaOutCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Bm8090m {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Bm8090mCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROGRAMA SECTION
     *
     */
    public void programa(Bm8090mCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1000-INICIO SECTION
     *
     * @return 
     */
    public InicioOutCtx inicio(Bm8090mCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - REPON-TPE-1200
     *
     * @return 
     */
    public ReponTpe1200OutCtx reponTpe1200(ReponTpe1200InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - REPON-TOB-1200
     *
     * @return 
     */
    public ReponTob1200OutCtx reponTob1200(ReponTob1200InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - AVE-LON-TIT-PE8090M
     *
     * @return 
     */
    public AveLonTitPe8090mOutCtx aveLonTitPe8090m(Bm8090mCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2000-TRATAMIENTO SECTION
     *
     * @return 
     */
    public TratamientoOutCtx tratamiento(TratamientoInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2500-TRAT-DE-DATOS SECTION
     *
     * @return 
     */
    public TratDeDatosOutCtx tratDeDatos(TratDeDatosInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - TRA-PER-FIS-PE8090M SECTION
     *
     * @return 
     */
    public TraPerFisPe8090mOutCtx traPerFisPe8090m(TraPerFisPe8090mInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - TRA-PER-JUR-PE8090M SECTION
     *
     * @return 
     */
    public TraPerJurPe8090mOutCtx traPerJurPe8090m(TraPerJurPe8090mInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2600-MONTAR-TITULO SECTION
     *
     * @return 
     */
    public MontarTituloOutCtx montarTitulo(Bm8090mCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - ESTRU-TIT-PE8090M
     *
     */
    public void estruTitPe8090m(EstruTitPe8090mInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - RED-GUI-PE8090M
     *
     * @return 
     */
    public RedGuiPe8090mOutCtx redGuiPe8090m(RedGuiPe8090mInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - RED-SEG-APE-PE8090M
     *
     * @return 
     */
    public RedSegApePe8090mOutCtx redSegApePe8090m(RedSegApePe8090mInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - REST-INP-UNO-PE8090M
     *
     * @return 
     */
    public RestInpUnoPe8090mOutCtx restInpUnoPe8090m(RestInpUnoPe8090mInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - RED-NOM-INI-PE8090M
     *
     * @return 
     */
    public RedNomIniPe8090mOutCtx redNomIniPe8090m(Bm8090mCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - REST-INP-DOS-PE8090M
     *
     * @return 
     */
    public RestInpDosPe8090mOutCtx restInpDosPe8090m(RestInpDosPe8090mInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - RED-PERSO-PE8090M
     *
     * @return 
     */
    public RedPersoPe8090mOutCtx redPersoPe8090m(Bm8090mCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - REST-INP-TRES-PE8090M
     *
     * @return 
     */
    public RestInpTresPe8090mOutCtx restInpTresPe8090m(RestInpTresPe8090mInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - INV-PER-ACT-PE8090M
     *
     * @return 
     */
    public InvPerActPe8090mOutCtx invPerActPe8090m(InvPerActPe8090mInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - ELIM-PRI-PER-PE8090M
     *
     * @return 
     */
    public ElimPriPerPe8090mOutCtx elimPriPerPe8090m(ElimPriPerPe8090mInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - CONFEC-TIT-PE8090M
     *
     * @return 
     */
    public ConfecTitPe8090mOutCtx confecTitPe8090m(Bm8090mCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - TRA-PER-OPT-PE8090M
     *
     * @return 
     */
    public TraPerOptPe8090mOutCtx traPerOptPe8090m(TraPerOptPe8090mInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - SEP-GUI-PE8090M
     *
     */
    public void sepGuiPe8090m(SepGuiPe8090mInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - STRING-GUI-UNO-PE8090M
     *
     * @return 
     */
    public StringGuiUnoPe8090mOutCtx stringGuiUnoPe8090m(StringGuiUnoPe8090mInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - STRING-GUI-TRE-PE8090M
     *
     * @return 
     */
    public StringGuiTrePe8090mOutCtx stringGuiTrePe8090m(StringGuiTrePe8090mInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - NOM-MAS-PE8090M
     *
     * @return 
     */
    public NomMasPe8090mOutCtx nomMasPe8090m(NomMasPe8090mInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - TRA-PER-OBL-PE8090M
     *
     * @return 
     */
    public TraPerOblPe8090mOutCtx traPerOblPe8090m(TraPerOblPe8090mInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - TAB-OBL-PE8090M
     *
     * @return 
     */
    public TabOblPe8090mOutCtx tabOblPe8090m(TabOblPe8090mInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - SEP-GIO-PE8090M
     *
     */
    public void sepGioPe8090m(SepGioPe8090mInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - STRING-GIO-UNO-PE8090M
     *
     * @return 
     */
    public StringGioUnoPe8090mOutCtx stringGioUnoPe8090m(StringGioUnoPe8090mInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - STRING-GIO-TRE-PE8090M
     *
     * @return 
     */
    public StringGioTrePe8090mOutCtx stringGioTrePe8090m(StringGioTrePe8090mInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - NOM-OBL-PE8090M
     *
     * @return 
     */
    public NomOblPe8090mOutCtx nomOblPe8090m(NomOblPe8090mInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - NOMBRE-TIT-PE8090M
     *
     * @return 
     */
    public NombreTitPe8090mOutCtx nombreTitPe8090m(NombreTitPe8090mInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - ALMACENAR-PE8090M SECTION
     *
     * @return 
     */
    public AlmacenarPe8090mOutCtx almacenarPe8090m(AlmacenarPe8090mInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - SEL-TRATO-PE8090M
     *
     */
    public void selTratoPe8090m(SelTratoPe8090mInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - TRATO-PRI-PE8090M
     *
     * @return 
     */
    public TratoPriPe8090mOutCtx tratoPriPe8090m(TratoPriPe8090mInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - VER-WTIP-PE8090M
     *
     */
    public void verWtipPe8090m(VerWtipPe8090mInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - SEL-JUR-PE8090M
     *
     */
    public void selJurPe8090m(SelJurPe8090mInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - TRATO1-PE8090M
     *
     * @return 
     */
    public Pe8090mOutCtx pe8090m(Pe8090mInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - UNO-UNO-UNO-PE8090M
     *
     * @return 
     */
    public UnoUnoUnoPe8090mOutCtx unoUnoUnoPe8090m(UnoUnoUnoPe8090mInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - UNO-UNO-DOS-PE8090M
     *
     * @return 
     */
    public UnoUnoDosPe8090mOutCtx unoUnoDosPe8090m(UnoUnoDosPe8090mInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - TRATO2-PE8090M
     *
     */
    public void pe8090mTRATO2(Pe8090mTRATO2InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - UNO-DOS-UNO-PE8090M
     *
     * @return 
     */
    public UnoDosUnoPe8090mOutCtx unoDosUnoPe8090m(UnoDosUnoPe8090mInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - UNO-DOS-DOS-PE8090M
     *
     * @return 
     */
    public UnoDosDosPe8090mOutCtx unoDosDosPe8090m(UnoDosDosPe8090mInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - TRATO3-PE8090M
     *
     * @return 
     */
    public Pe8090mTRATO3OutCtx pe8090mTRATO3(Bm8090mCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - TRATO4-PE8090M
     *
     * @return 
     */
    public Pe8090mTRATO4OutCtx pe8090mTRATO4(Pe8090mTRATO4InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - TRATO5-PE8090M
     *
     * @return 
     */
    public Pe8090mTRATO5OutCtx pe8090mTRATO5(Pe8090mTRATO5InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - TRATO6-PE8090M
     *
     * @return 
     */
    public Pe8090mTRATO6OutCtx pe8090mTRATO6(Bm8090mCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - TRATO7-PE8090M
     *
     * @return 
     */
    public Pe8090mTRATO7OutCtx pe8090mTRATO7(Pe8090mTRATO7InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - ES-FIS-ALM-PE8090M
     *
     * @return 
     */
    public EsFisAlmPe8090mOutCtx esFisAlmPe8090m(EsFisAlmPe8090mInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - ES-JUR-ALM-PE8090M
     *
     * @return 
     */
    public EsJurAlmPe8090mOutCtx esJurAlmPe8090m(EsJurAlmPe8090mInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - ALMACENAR-PE8090M-SALIDA
     *
     */
    public void almacenarPe8090mSalida(Bm8090mCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - FIN-PER-FIS-PE8090M SECTION
     *
     */
    public void finPerFisPe8090m(Bm8090mCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - FIN-PER-FIS-PE8090M-ENTRADA
     *
     */
    public void finPerFisPe8090mEntrada(FinPerFisPe8090mEntradaInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - MAS7-CAT-PE8090M
     *
     * @return 
     */
    public CatPe8090mOutCtx catPe8090m(CatPe8090mInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - MAS7-CAS-PE8090M
     *
     * @return 
     */
    public CasPe8090mOutCtx casPe8090m(CasPe8090mInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - MAS3-CAT-PE8090M
     *
     * @return 
     */
    public CatPe8090mMAS3OutCtx catPe8090mMAS3(CatPe8090mMAS3InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - MAS3-CAS-PE8090M
     *
     * @return 
     */
    public CasPe8090mMAS3OutCtx casPe8090mMAS3(CasPe8090mMAS3InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - MAS6-CAT-PE8090M
     *
     * @return 
     */
    public CatPe8090mMAS6OutCtx catPe8090mMAS6(CatPe8090mMAS6InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - MAS6-CAS-PE8090M
     *
     * @return 
     */
    public CasPe8090mMAS6OutCtx casPe8090mMAS6(CasPe8090mMAS6InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - FIN-PER-FIS-PE8090M-SALIDA
     *
     */
    public void finPerFisPe8090mSalida(Bm8090mCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2700-PARTIR-TITULO SECTION
     *
     * @return 
     */
    public PartirTituloOutCtx partirTitulo(PartirTituloInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - MONITORA SECTION
     *
     * @return 
     */
    public MonitoraOutCtx monitora(MonitoraInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PARTICION SECTION
     *
     */
    public void particion(Bm8090mCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PARTICION-ENTRADA
     *
     * @return 
     */
    public ParticionEntradaOutCtx particionEntrada(ParticionEntradaInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PARTICION-01
     *
     * @return 
     */
    public Particion01OutCtx particion01(Particion01InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PARTICION-02
     *
     * @return 
     */
    public Particion02OutCtx particion02(Particion02InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PARTICION-SALIDA
     *
     */
    public void particionSalida(Bm8090mCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - BUS-CARACTER SECTION
     *
     */
    public void busCaracter(Bm8090mCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - BUS-CARACTER-ENTRADA
     *
     * @return 
     */
    public BusCaracterEntradaOutCtx busCaracterEntrada(BusCaracterEntradaInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - BUS-CARACTER-SALIDA
     *
     */
    public void busCaracterSalida(Bm8090mCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - RESPUESTA SECTION
     *
     */
    public void respuesta(Bm8090mCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - RESPUESTA-ENTRADA
     *
     * @return 
     */
    public RespuestaEntradaOutCtx respuestaEntrada(RespuestaEntradaInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - RESPUESTA-SALIDA
     *
     */
    public void respuestaSalida(Bm8090mCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2530-COMPRIMIR-NOMBRE SECTION
     *
     * @return 
     */
    public ComprimirNombreOutCtx comprimirNombre(ComprimirNombreInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - OPC00-PER SECTION
     *
     * @return 
     */
    public PerOutCtx per(PerInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - OPC00-COM SECTION
     *
     * @return 
     */
    public ComOutCtx com(ComInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - OPC01-PER SECTION
     *
     * @return 
     */
    public PerOPC01OutCtx perOPC01(PerOPC01InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - OPC02-PER SECTION
     *
     * @return 
     */
    public PerOPC02OutCtx perOPC02(PerOPC02InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8000-FINAL SECTION
     *
     * @return 
     */
    public Final8000OutCtx final8000(Final8000InCtx methodIn) throws Exception;


     /**
	 * This will invoke the program given parameters from the
      * caller program.
	 *
	 * @return return code of the program
	 */
     public int call(ProgramContext programCtx, Object[] parameters) throws Exception;

     /**
	 * This will invoke the program given Field parameters from
      * the caller program.
	 *
	 * @return return code of the program
	 */
     public int call(ProgramContext programCtx, Field... parameters) throws Exception;
}
