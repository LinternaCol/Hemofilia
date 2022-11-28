package com.savia.hemofilia.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Date;

@Entity
@Table(name = "tbl_hemofilia_paso")
public class HemofiliaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_hemofilia", nullable = false,unique = true)
    private Long id;
    @Column(length = 20)
    private String primerNombre;
    @Column(length = 20)
    private String segundoNombre;
    @Column(length = 20)
    private String primerApellido;
    @Column(length = 20)
    private String segundoApellido;
    @Column(length = 20, nullable = false)
    @Pattern(regexp = "RC|TI|CC|CE|PA|MS|AS|CD|SC|PE")
    private String tipoIdentificacionUsuario;
    @Column(length = 20, name = "numero_identificacion_usuario")
    @NotNull
    private String numeroIdentificacion;
    @Column()
    private Date fechaNacimientoUsuario;
    @Column(length = 1, name = "sexo_usuario")
    @Pattern(regexp = "M|F")
    private String sexo;
    @Column()
    private int ocupacionUsuario;
    @Column()
    @Pattern(regexp = "C|S|P|E|N")
    private String sgsss;
    @Column()
    private String codigoEapb;
    @Column()
    private int CodigoPertenenciaEtnica;
    @Column()
    private int grupoPoblacional;
    @Column()
    private int municipioResidencia;
    @Column()
    private String numeroTelefonicoUsuario;
    @Column()
    private Date fechaAfilicionEps;
    @Column()
    private int estadoGestacionUsuario;
    @Column()
    private int usuarioProgramaPlanificacion;
    @Column()
    private int edadUsuarioConsulta;
    @Column()
    private int motivoPruebaDiagnostico;
    @Column()
    private Date fechaDiagnostico;
    @Column(length = 12,name = "codigo_valido_habilitacion_ips")
    private Long codigoValidoHabilitacionIPS;
    @Column()
    private int tipoDeficienciaDiagnosticada;
    @Column()
    private int clasificacionSeveridadNivelFactor;
    @Column()
    private float actividadCoagulanteFactor;
    @Column()
    private int antecedentesFamiliaresAsociadosHemofilia;
    @Column()
    private int factorRecibidoPrimerTratamiento;
    @Column()
    private int esquemaPrimerTratamiento;
    @Column()
    private Date fechaInicioPrimerTratamiento;
    @Column()
    private int factorRecibidoActualTratamieno;
    @Column()
    private int esquemaActualTratamiento;
    @Column()
    private float pesoUsuario;
    @Column()
    private float dosis;
    @Column()
    private float frecuenciaSemana;
    @Column()
    private int numeroDosisTotalesPeriodo;
    @Column()
    private int numeroAplicacionesTotalesPeriodo;
    @Column()
    private int modalidadAplicacionTratamiento;
    @Column()
    private int viaAdministracion;
    @Column(length = 12,name = "cum_1")
    private String cum1;
    @Column(length = 12,name = "cum_2")
    private String cum2;
    @Column(length = 12,name = "cum_3")
    private String cum3;
    @Column(length = 12,name = "cum_4")
    private String cum4;
    @Column(name = "codigo_habilitacion_eps")
    private Long  codigoHabilitacionEps;
    @Column()
    private int hermartrosis;
    @Column(length = 4,name = "hemorragia_ilio_psoas")
    private int hemorragiaIlioPsoas;
    @Column()
    private int numeroHermatrosisEspontaneasUltimoAño;
    @Column()
    private int numeroHermatrosisTraumaticasUltimoAño;
    @Column()
    private int hemorragiaMuscular;
    @Column()
    private int hemorragiaIntracraneal;
    @Column()
    private int hemorragiaCuello;
    @Column()
    private int hemorragiaOral;
    @Column()
    private int hemorragiaOtrasLocalizaciones;
    @Column()
    private int hemorragiaOtrasDiferentesHematrosisEspontaneas;
    @Column()
    private int hemorragiaOtrasDiferentesHematrosisTraumaticas;
    @Column()
    private int hemorragiaAsociadaProcesosDiferentesHematrosis;
    @Column()
    private int presenciaInhibidorFechaCorte;
    @Column()
    private Date fechaDeterminacionTitulosInhibidor;
    @Column()
    private int recibidoItiUsuario;
    @Column()
    private int recibioItiPeriodo;
    @Column()
    private int tiempoUsuarioIti;
    @Column()
    private int artropatiaHemofilicaCronica;
    @Column()
    private int numArticulacionesComprometidas;
    @Column()
    private int usuarioInfectadoVhc;
    @Column()
    private int usuarioInfectadoVhb;
    @Column()
    private int usuarioInfectadoVih;
    @Column()
    private int pseudotumores;
    @Column()
    private int fracturas;
    @Column()
    private int anafilaxis;
    @Column()
    private int factorAnacfiliactica;
    @Column()
    private int reemplazoArticularesVida;
    @Column()
    private int reemplazoArticularesPeriodo;
    @Column()
    private int profesionalAtencionUsuario;
    @Column()
    private int consultasPresencialesHematologo;
    @Column()
    private int consultasPresencialesOrtopedista;
    @Column()
    private int intervencionProfesionalEnfermeria;
    @Column()
    private int consultasOdontologo;
    @Column()
    private int consultaNutricionista;
    @Column()
    private int intervencionTrabajoSocial;
    @Column()
    private int consultaFisiatria;
    @Column()
    private int consultaPsicologia;
    @Column()
    private int intervencionQuimicoFarmaceutico;
    @Column()
    private int intervencionFisioterapia;
    @Column()
    private String primerNombreMedicoPrincipal;
    @Column()
    private String segundoNombreMedicoPrincipal;
    @Column()
    private String primerApellidoMedicoPrincipal;
    @Column()
    private String segundoApellidoMedicoPrincipal;
    @Column()
    private int numeroAtencionesServicioUrgenciasHemofilia;
    @Column()
    private int numeroEventosHospitalariosHemofilia;
    @Column()
    private Double costoTotalUnidadesFactor;
    @Column()
    private Double costosAgentePuente;
    @Column()
    private Double costosCoagulopatia;
    @Column()
    private Double costosIncapacidadesCoagulopatia;
    @Column()
    private int novedades;
    @Column()
    private int causaMuerte;
    @Column()
    private Date fechaMuerte;
    @Column()
    private int bdua;
    @Column()
    private Date fechaCorte;





    //Constructor


    public HemofiliaModel(Long id, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String tipoIdentificacionUsuario, String numeroIdentificacion, Date fechaNacimientoUsuario, String sexo, int ocupacionUsuario, String sgsss, String codigoEapb, int codigoPertenenciaEtnica, int grupoPoblacional, int municipioResidencia, String numeroTelefonicoUsuario, Date fechaAfilicionEps, int estadoGestacionUsuario, int usuarioProgramaPlanificacion, int edadUsuarioConsulta, int motivoPruebaDiagnostico, Date fechaDiagnostico, Long codigoValidoHabilitacionIPS, int tipoDeficienciaDiagnosticada, int clasificacionSeveridadNivelFactor, float actividadCoagulanteFactor, int antecedentesFamiliaresAsociadosHemofilia, int factorRecibidoPrimerTratamiento, int esquemaPrimerTratamiento, Date fechaInicioPrimerTratamiento, int factorRecibidoActualTratamieno, int esquemaActualTratamiento, float pesoUsuario, float dosis, float frecuenciaSemana, int numeroDosisTotalesPeriodo, int numeroAplicacionesTotalesPeriodo, int modalidadAplicacionTratamiento, int viaAdministracion, String cum1, String cum2, String cum3, String cum4, Long codigoHabilitacionEps, int hermartrosis, int hemorragiaIlioPsoas, int numeroHermatrosisEspontaneasUltimoAno, int numeroHermatrosisTraumaticasUltimoAno, int hemorragiaMuscular, int hemorragiaIntracraneal, int hemorragiaCuello, int hemorragiaOral, int hemorragiaOtrasLocalizaciones, int hemorragiaOtrasDiferentesHematrosisEspontaneas, int hemorragiaOtrasDiferentesHematrosisTraumaticas, int hemorragiaAsociadaProcesosDiferentesHematrosis, int presenciaInhibidorFechaCorte, Date fechaDeterminacionTitulosInhibidor, int recibidoItiUsuario, int recibioItiPeriodo, int tiempoUsuarioIti, int artropatiaHemofilicaCronica, int numArticulacionesComprometidas, int usuarioInfectadoVhc, int usuarioInfectadoVhb, int usuarioInfectadoVih, int pseudotumores, int fracturas, int anafilaxis, int factorAnacfiliactica, int reemplazoArticularesVida, int reemplazoArticularesPeriodo, int profesionalAtencionUsuario, int consultasPresencialesHematólogo, int consultasPresencialesOrtopedista, int intervencionProfesionalEnfermeria, int consultasOdontologo, int consultaNutricionista, int intervencionTrabajoSocial, int consultaFisiatria, int consultaPsicologia, int intervencionQuimicoFarmaceutico, int intervencionFisioterapia, String primerNombreMedicoPrincipal, String segundoNombreMedicoPrincipal, String primerApellidoMedicoPrincipal, String segundoApellidoMedicoPrincipal, int numeroAtencionesServicioUrgenciasHemofilia, int numeroEventosHospitalariosHemofilia, Double costoTotalUnidadesFactor, Double costosAgentePuente, Double costosCoagulopatia, Double costosIncapacidadesCoagulopatia, int novedades, int causaMuerte, Date fechaMuerte, int bdua, Date fechaCorte) {
        this.id = id;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.tipoIdentificacionUsuario = tipoIdentificacionUsuario;
        this.numeroIdentificacion = numeroIdentificacion;
        this.fechaNacimientoUsuario = fechaNacimientoUsuario;
        this.sexo = sexo;
        this.ocupacionUsuario = ocupacionUsuario;
        this.sgsss = sgsss;
        this.codigoEapb = codigoEapb;
        CodigoPertenenciaEtnica = codigoPertenenciaEtnica;
        this.grupoPoblacional = grupoPoblacional;
        this.municipioResidencia = municipioResidencia;
        this.numeroTelefonicoUsuario = numeroTelefonicoUsuario;
        this.fechaAfilicionEps = fechaAfilicionEps;
        this.estadoGestacionUsuario = estadoGestacionUsuario;
        this.usuarioProgramaPlanificacion = usuarioProgramaPlanificacion;
        this.edadUsuarioConsulta = edadUsuarioConsulta;
        this.motivoPruebaDiagnostico = motivoPruebaDiagnostico;
        this.fechaDiagnostico = fechaDiagnostico;
        this.codigoValidoHabilitacionIPS = codigoValidoHabilitacionIPS;
        this.tipoDeficienciaDiagnosticada = tipoDeficienciaDiagnosticada;
        this.clasificacionSeveridadNivelFactor = clasificacionSeveridadNivelFactor;
        this.actividadCoagulanteFactor = actividadCoagulanteFactor;
        this.antecedentesFamiliaresAsociadosHemofilia = antecedentesFamiliaresAsociadosHemofilia;
        this.factorRecibidoPrimerTratamiento = factorRecibidoPrimerTratamiento;
        this.esquemaPrimerTratamiento = esquemaPrimerTratamiento;
        this.fechaInicioPrimerTratamiento = fechaInicioPrimerTratamiento;
        this.factorRecibidoActualTratamieno = factorRecibidoActualTratamieno;
        this.esquemaActualTratamiento = esquemaActualTratamiento;
        this.pesoUsuario = pesoUsuario;
        this.dosis = dosis;
        this.frecuenciaSemana = frecuenciaSemana;
        this.numeroDosisTotalesPeriodo = numeroDosisTotalesPeriodo;
        this.numeroAplicacionesTotalesPeriodo = numeroAplicacionesTotalesPeriodo;
        this.modalidadAplicacionTratamiento = modalidadAplicacionTratamiento;
        this.viaAdministracion = viaAdministracion;
        this.cum1 = cum1;
        this.cum2 = cum2;
        this.cum3 = cum3;
        this.cum4 = cum4;
        this.codigoHabilitacionEps = codigoHabilitacionEps;
        this.hermartrosis = hermartrosis;
        this.hemorragiaIlioPsoas = hemorragiaIlioPsoas;
        this.numeroHermatrosisEspontaneasUltimoAño = numeroHermatrosisEspontaneasUltimoAno;
        this.numeroHermatrosisTraumaticasUltimoAño = numeroHermatrosisTraumaticasUltimoAno;
        this.hemorragiaMuscular = hemorragiaMuscular;
        this.hemorragiaIntracraneal = hemorragiaIntracraneal;
        this.hemorragiaCuello = hemorragiaCuello;
        this.hemorragiaOral = hemorragiaOral;
        this.hemorragiaOtrasLocalizaciones = hemorragiaOtrasLocalizaciones;
        this.hemorragiaOtrasDiferentesHematrosisEspontaneas = hemorragiaOtrasDiferentesHematrosisEspontaneas;
        this.hemorragiaOtrasDiferentesHematrosisTraumaticas = hemorragiaOtrasDiferentesHematrosisTraumaticas;
        this.hemorragiaAsociadaProcesosDiferentesHematrosis = hemorragiaAsociadaProcesosDiferentesHematrosis;
        this.presenciaInhibidorFechaCorte = presenciaInhibidorFechaCorte;
        this.fechaDeterminacionTitulosInhibidor = fechaDeterminacionTitulosInhibidor;
        this.recibidoItiUsuario = recibidoItiUsuario;
        this.recibioItiPeriodo = recibioItiPeriodo;
        this.tiempoUsuarioIti = tiempoUsuarioIti;
        this.artropatiaHemofilicaCronica = artropatiaHemofilicaCronica;
        this.numArticulacionesComprometidas = numArticulacionesComprometidas;
        this.usuarioInfectadoVhc = usuarioInfectadoVhc;
        this.usuarioInfectadoVhb = usuarioInfectadoVhb;
        this.usuarioInfectadoVih = usuarioInfectadoVih;
        this.pseudotumores = pseudotumores;
        this.fracturas = fracturas;
        this.anafilaxis = anafilaxis;
        this.factorAnacfiliactica = factorAnacfiliactica;
        this.reemplazoArticularesVida = reemplazoArticularesVida;
        this.reemplazoArticularesPeriodo = reemplazoArticularesPeriodo;
        this.profesionalAtencionUsuario = profesionalAtencionUsuario;
        this.consultasPresencialesHematologo = consultasPresencialesHematólogo;
        this.consultasPresencialesOrtopedista = consultasPresencialesOrtopedista;
        this.intervencionProfesionalEnfermeria = intervencionProfesionalEnfermeria;
        this.consultasOdontologo = consultasOdontologo;
        this.consultaNutricionista = consultaNutricionista;
        this.intervencionTrabajoSocial = intervencionTrabajoSocial;
        this.consultaFisiatria = consultaFisiatria;
        this.consultaPsicologia = consultaPsicologia;
        this.intervencionQuimicoFarmaceutico = intervencionQuimicoFarmaceutico;
        this.intervencionFisioterapia = intervencionFisioterapia;
        this.primerNombreMedicoPrincipal = primerNombreMedicoPrincipal;
        this.segundoNombreMedicoPrincipal = segundoNombreMedicoPrincipal;
        this.primerApellidoMedicoPrincipal = primerApellidoMedicoPrincipal;
        this.segundoApellidoMedicoPrincipal = segundoApellidoMedicoPrincipal;
        this.numeroAtencionesServicioUrgenciasHemofilia = numeroAtencionesServicioUrgenciasHemofilia;
        this.numeroEventosHospitalariosHemofilia = numeroEventosHospitalariosHemofilia;
        this.costoTotalUnidadesFactor = costoTotalUnidadesFactor;
        this.costosAgentePuente = costosAgentePuente;
        this.costosCoagulopatia = costosCoagulopatia;
        this.costosIncapacidadesCoagulopatia = costosIncapacidadesCoagulopatia;
        this.novedades = novedades;
        this.causaMuerte = causaMuerte;
        this.fechaMuerte = fechaMuerte;
        this.bdua = bdua;
        this.fechaCorte = fechaCorte;
    }

    public HemofiliaModel(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String tipoIdentificacionUsuario, String numeroIdentificacion, Date fechaNacimientoUsuario, String sexo, int ocupacionUsuario, String sgsss, String codigoEapb, int codigoPertenenciaEtnica, int grupoPoblacional, int municipioResidencia, String numeroTelefonicoUsuario, Date fechaAfilicionEps, int estadoGestacionUsuario, int usuarioProgramaPlanificacion, int edadUsuarioConsulta, int motivoPruebaDiagnostico, Date fechaDiagnostico, Long codigoValidoHabilitacionIPS, int tipoDeficienciaDiagnosticada, int clasificacionSeveridadNivelFactor, float actividadCoagulanteFactor, int antecedentesFamiliaresAsociadosHemofilia, int factorRecibidoPrimerTratamiento, int esquemaPrimerTratamiento, Date fechaInicioPrimerTratamiento, int factorRecibidoActualTratamieno, int esquemaActualTratamiento, float pesoUsuario, float dosis, float frecuenciaSemana, int numeroDosisTotalesPeriodo, int numeroAplicacionesTotalesPeriodo, int modalidadAplicacionTratamiento, int viaAdministracion, String cum1, String cum2, String cum3, String cum4, Long codigoHabilitacionEps, int hermartrosis, int hemorragiaIlioPsoas, int numeroHermatrosisEspontaneasUltimoAno, int numeroHermatrosisTraumaticasUltimoAno, int hemorragiaMuscular, int hemorragiaIntracraneal, int hemorragiaCuello, int hemorragiaOral, int hemorragiaOtrasLocalizaciones, int hemorragiaOtrasDiferentesHematrosisEspontaneas, int hemorragiaOtrasDiferentesHematrosisTraumaticas, int hemorragiaAsociadaProcesosDiferentesHematrosis, int presenciaInhibidorFechaCorte, Date fechaDeterminacionTitulosInhibidor, int recibidoItiUsuario, int recibioItiPeriodo, int tiempoUsuarioIti, int artropatiaHemofilicaCronica, int numArticulacionesComprometidas, int usuarioInfectadoVhc, int usuarioInfectadoVhb, int usuarioInfectadoVih, int pseudotumores, int fracturas, int anafilaxis, int factorAnacfiliactica, int reemplazoArticularesVida, int reemplazoArticularesPeriodo, int profesionalAtencionUsuario, int consultasPresencialesHematólogo, int consultasPresencialesOrtopedista, int intervencionProfesionalEnfermeria, int consultasOdontologo, int consultaNutricionista, int intervencionTrabajoSocial, int consultaFisiatria, int consultaPsicologia, int intervencionQuimicoFarmaceutico, int intervencionFisioterapia, String primerNombreMedicoPrincipal, String segundoNombreMedicoPrincipal, String primerApellidoMedicoPrincipal, String segundoApellidoMedicoPrincipal, int numeroAtencionesServicioUrgenciasHemofilia, int numeroEventosHospitalariosHemofilia, Double costoTotalUnidadesFactor, Double costosAgentePuente, Double costosCoagulopatia, Double costosIncapacidadesCoagulopatia, int novedades, int causaMuerte, Date fechaMuerte, int bdua, Date fechaCorte) {
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.tipoIdentificacionUsuario = tipoIdentificacionUsuario;
        this.numeroIdentificacion = numeroIdentificacion;
        this.fechaNacimientoUsuario = fechaNacimientoUsuario;
        this.sexo = sexo;
        this.ocupacionUsuario = ocupacionUsuario;
        this.sgsss = sgsss;
        this.codigoEapb = codigoEapb;
        CodigoPertenenciaEtnica = codigoPertenenciaEtnica;
        this.grupoPoblacional = grupoPoblacional;
        this.municipioResidencia = municipioResidencia;
        this.numeroTelefonicoUsuario = numeroTelefonicoUsuario;
        this.fechaAfilicionEps = fechaAfilicionEps;
        this.estadoGestacionUsuario = estadoGestacionUsuario;
        this.usuarioProgramaPlanificacion = usuarioProgramaPlanificacion;
        this.edadUsuarioConsulta = edadUsuarioConsulta;
        this.motivoPruebaDiagnostico = motivoPruebaDiagnostico;
        this.fechaDiagnostico = fechaDiagnostico;
        this.codigoValidoHabilitacionIPS = codigoValidoHabilitacionIPS;
        this.tipoDeficienciaDiagnosticada = tipoDeficienciaDiagnosticada;
        this.clasificacionSeveridadNivelFactor = clasificacionSeveridadNivelFactor;
        this.actividadCoagulanteFactor = actividadCoagulanteFactor;
        this.antecedentesFamiliaresAsociadosHemofilia = antecedentesFamiliaresAsociadosHemofilia;
        this.factorRecibidoPrimerTratamiento = factorRecibidoPrimerTratamiento;
        this.esquemaPrimerTratamiento = esquemaPrimerTratamiento;
        this.fechaInicioPrimerTratamiento = fechaInicioPrimerTratamiento;
        this.factorRecibidoActualTratamieno = factorRecibidoActualTratamieno;
        this.esquemaActualTratamiento = esquemaActualTratamiento;
        this.pesoUsuario = pesoUsuario;
        this.dosis = dosis;
        this.frecuenciaSemana = frecuenciaSemana;
        this.numeroDosisTotalesPeriodo = numeroDosisTotalesPeriodo;
        this.numeroAplicacionesTotalesPeriodo = numeroAplicacionesTotalesPeriodo;
        this.modalidadAplicacionTratamiento = modalidadAplicacionTratamiento;
        this.viaAdministracion = viaAdministracion;
        this.cum1 = cum1;
        this.cum2 = cum2;
        this.cum3 = cum3;
        this.cum4 = cum4;
        this.codigoHabilitacionEps = codigoHabilitacionEps;
        this.hermartrosis = hermartrosis;
        this.hemorragiaIlioPsoas = hemorragiaIlioPsoas;
        this.numeroHermatrosisEspontaneasUltimoAño = numeroHermatrosisEspontaneasUltimoAno;
        this.numeroHermatrosisTraumaticasUltimoAño = numeroHermatrosisTraumaticasUltimoAno;
        this.hemorragiaMuscular = hemorragiaMuscular;
        this.hemorragiaIntracraneal = hemorragiaIntracraneal;
        this.hemorragiaCuello = hemorragiaCuello;
        this.hemorragiaOral = hemorragiaOral;
        this.hemorragiaOtrasLocalizaciones = hemorragiaOtrasLocalizaciones;
        this.hemorragiaOtrasDiferentesHematrosisEspontaneas = hemorragiaOtrasDiferentesHematrosisEspontaneas;
        this.hemorragiaOtrasDiferentesHematrosisTraumaticas = hemorragiaOtrasDiferentesHematrosisTraumaticas;
        this.hemorragiaAsociadaProcesosDiferentesHematrosis = hemorragiaAsociadaProcesosDiferentesHematrosis;
        this.presenciaInhibidorFechaCorte = presenciaInhibidorFechaCorte;
        this.fechaDeterminacionTitulosInhibidor = fechaDeterminacionTitulosInhibidor;
        this.recibidoItiUsuario = recibidoItiUsuario;
        this.recibioItiPeriodo = recibioItiPeriodo;
        this.tiempoUsuarioIti = tiempoUsuarioIti;
        this.artropatiaHemofilicaCronica = artropatiaHemofilicaCronica;
        this.numArticulacionesComprometidas = numArticulacionesComprometidas;
        this.usuarioInfectadoVhc = usuarioInfectadoVhc;
        this.usuarioInfectadoVhb = usuarioInfectadoVhb;
        this.usuarioInfectadoVih = usuarioInfectadoVih;
        this.pseudotumores = pseudotumores;
        this.fracturas = fracturas;
        this.anafilaxis = anafilaxis;
        this.factorAnacfiliactica = factorAnacfiliactica;
        this.reemplazoArticularesVida = reemplazoArticularesVida;
        this.reemplazoArticularesPeriodo = reemplazoArticularesPeriodo;
        this.profesionalAtencionUsuario = profesionalAtencionUsuario;
        this.consultasPresencialesHematologo = consultasPresencialesHematólogo;
        this.consultasPresencialesOrtopedista = consultasPresencialesOrtopedista;
        this.intervencionProfesionalEnfermeria = intervencionProfesionalEnfermeria;
        this.consultasOdontologo = consultasOdontologo;
        this.consultaNutricionista = consultaNutricionista;
        this.intervencionTrabajoSocial = intervencionTrabajoSocial;
        this.consultaFisiatria = consultaFisiatria;
        this.consultaPsicologia = consultaPsicologia;
        this.intervencionQuimicoFarmaceutico = intervencionQuimicoFarmaceutico;
        this.intervencionFisioterapia = intervencionFisioterapia;
        this.primerNombreMedicoPrincipal = primerNombreMedicoPrincipal;
        this.segundoNombreMedicoPrincipal = segundoNombreMedicoPrincipal;
        this.primerApellidoMedicoPrincipal = primerApellidoMedicoPrincipal;
        this.segundoApellidoMedicoPrincipal = segundoApellidoMedicoPrincipal;
        this.numeroAtencionesServicioUrgenciasHemofilia = numeroAtencionesServicioUrgenciasHemofilia;
        this.numeroEventosHospitalariosHemofilia = numeroEventosHospitalariosHemofilia;
        this.costoTotalUnidadesFactor = costoTotalUnidadesFactor;
        this.costosAgentePuente = costosAgentePuente;
        this.costosCoagulopatia = costosCoagulopatia;
        this.costosIncapacidadesCoagulopatia = costosIncapacidadesCoagulopatia;
        this.novedades = novedades;
        this.causaMuerte = causaMuerte;
        this.fechaMuerte = fechaMuerte;
        this.bdua = bdua;
        this.fechaCorte = fechaCorte;
    }

    public HemofiliaModel() {
    }



    //Getters an setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getTipoIdentificacionUsuario() {
        return tipoIdentificacionUsuario;
    }

    public void setTipoIdentificacionUsuario(String tipoIdentificacionUsuario) {
        this.tipoIdentificacionUsuario = tipoIdentificacionUsuario;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public Date getFechaNacimientoUsuario() {
        return fechaNacimientoUsuario;
    }

    public void setFechaNacimientoUsuario(Date fechaNacimientoUsuario) {
        this.fechaNacimientoUsuario = fechaNacimientoUsuario;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getOcupacionUsuario() {
        return ocupacionUsuario;
    }

    public void setOcupacionUsuario(int ocupacionUsuario) {
        this.ocupacionUsuario = ocupacionUsuario;
    }

    public String getSgsss() {
        return sgsss;
    }

    public void setSgsss(String sgsss) {
        this.sgsss = sgsss;
    }

    public String getCodigoEapb() {
        return codigoEapb;
    }

    public void setCodigoEapb(String codigoEapb) {
        this.codigoEapb = codigoEapb;
    }

    public int getCodigoPertenenciaEtnica() {
        return CodigoPertenenciaEtnica;
    }

    public void setCodigoPertenenciaEtnica(int codigoPertenenciaEtnica) {
        CodigoPertenenciaEtnica = codigoPertenenciaEtnica;
    }

    public int getGrupoPoblacional() {
        return grupoPoblacional;
    }

    public void setGrupoPoblacional(int grupoPoblacional) {
        this.grupoPoblacional = grupoPoblacional;
    }

    public int getMunicipioResidencia() {
        return municipioResidencia;
    }

    public void setMunicipioResidencia(int municipioResidencia) {
        this.municipioResidencia = municipioResidencia;
    }

    public String getNumeroTelefonicoUsuario() {
        return numeroTelefonicoUsuario;
    }

    public void setNumeroTelefonicoUsuario(String numeroTelefonicoUsuario) {
        this.numeroTelefonicoUsuario = numeroTelefonicoUsuario;
    }

    public Date getFechaAfilicionEps() {
        return fechaAfilicionEps;
    }

    public void setFechaAfilicionEps(Date fechaAfilicionEps) {
        this.fechaAfilicionEps = fechaAfilicionEps;
    }

    public int getEstadoGestacionUsuario() {
        return estadoGestacionUsuario;
    }

    public void setEstadoGestacionUsuario(int estadoGestacionUsuario) {
        this.estadoGestacionUsuario = estadoGestacionUsuario;
    }

    public int getUsuarioProgramaPlanificacion() {
        return usuarioProgramaPlanificacion;
    }

    public void setUsuarioProgramaPlanificacion(int usuarioProgramaPlanificacion) {
        this.usuarioProgramaPlanificacion = usuarioProgramaPlanificacion;
    }

    public int getEdadUsuarioConsulta() {
        return edadUsuarioConsulta;
    }

    public void setEdadUsuarioConsulta(int edadUsuarioConsulta) {
        this.edadUsuarioConsulta = edadUsuarioConsulta;
    }

    public int getMotivoPruebaDiagnostico() {
        return motivoPruebaDiagnostico;
    }

    public void setMotivoPruebaDiagnostico(int motivoPruebaDiagnostico) {
        this.motivoPruebaDiagnostico = motivoPruebaDiagnostico;
    }

    public Date getFechaDiagnostico() {
        return fechaDiagnostico;
    }

    public void setFechaDiagnostico(Date fechaDiagnostico) {
        this.fechaDiagnostico = fechaDiagnostico;
    }

    public Long getCodigoValidoHabilitacionIPS() {
        return codigoValidoHabilitacionIPS;
    }

    public void setCodigoValidoHabilitacionIPS(Long codigoValidoHabilitacionIPS) {
        this.codigoValidoHabilitacionIPS = codigoValidoHabilitacionIPS;
    }

    public int getTipoDeficienciaDiagnosticada() {
        return tipoDeficienciaDiagnosticada;
    }

    public void setTipoDeficienciaDiagnosticada(int tipoDeficienciaDiagnosticada) {
        this.tipoDeficienciaDiagnosticada = tipoDeficienciaDiagnosticada;
    }

    public int getClasificacionSeveridadNivelFactor() {
        return clasificacionSeveridadNivelFactor;
    }

    public void setClasificacionSeveridadNivelFactor(int clasificacionSeveridadNivelFactor) {
        this.clasificacionSeveridadNivelFactor = clasificacionSeveridadNivelFactor;
    }

    public float getActividadCoagulanteFactor() {
        return actividadCoagulanteFactor;
    }

    public void setActividadCoagulanteFactor(float actividadCoagulanteFactor) {
        this.actividadCoagulanteFactor = actividadCoagulanteFactor;
    }

    public int getAntecedentesFamiliaresAsociadosHemofilia() {
        return antecedentesFamiliaresAsociadosHemofilia;
    }

    public void setAntecedentesFamiliaresAsociadosHemofilia(int antecedentesFamiliaresAsociadosHemofilia) {
        this.antecedentesFamiliaresAsociadosHemofilia = antecedentesFamiliaresAsociadosHemofilia;
    }

    public int getFactorRecibidoPrimerTratamiento() {
        return factorRecibidoPrimerTratamiento;
    }

    public void setFactorRecibidoPrimerTratamiento(int factorRecibidoPrimerTratamiento) {
        this.factorRecibidoPrimerTratamiento = factorRecibidoPrimerTratamiento;
    }

    public int getEsquemaPrimerTratamiento() {
        return esquemaPrimerTratamiento;
    }

    public void setEsquemaPrimerTratamiento(int esquemaPrimerTratamiento) {
        this.esquemaPrimerTratamiento = esquemaPrimerTratamiento;
    }

    public Date getFechaInicioPrimerTratamiento() {
        return fechaInicioPrimerTratamiento;
    }

    public void setFechaInicioPrimerTratamiento(Date fechaInicioPrimerTratamiento) {
        this.fechaInicioPrimerTratamiento = fechaInicioPrimerTratamiento;
    }

    public int getFactorRecibidoActualTratamieno() {
        return factorRecibidoActualTratamieno;
    }

    public void setFactorRecibidoActualTratamieno(int factorRecibidoActualTratamieno) {
        this.factorRecibidoActualTratamieno = factorRecibidoActualTratamieno;
    }

    public int getEsquemaActualTratamiento() {
        return esquemaActualTratamiento;
    }

    public void setEsquemaActualTratamiento(int esquemaActualTratamiento) {
        this.esquemaActualTratamiento = esquemaActualTratamiento;
    }

    public float getPesoUsuario() {
        return pesoUsuario;
    }

    public void setPesoUsuario(float pesoUsuario) {
        this.pesoUsuario = pesoUsuario;
    }

    public float getDosis() {
        return dosis;
    }

    public void setDosis(float dosis) {
        this.dosis = dosis;
    }

    public float getFrecuenciaSemana() {
        return frecuenciaSemana;
    }

    public void setFrecuenciaSemana(float frecuenciaSemana) {
        this.frecuenciaSemana = frecuenciaSemana;
    }

    public int getNumeroDosisTotalesPeriodo() {
        return numeroDosisTotalesPeriodo;
    }

    public void setNumeroDosisTotalesPeriodo(int numeroDosisTotalesPeriodo) {
        this.numeroDosisTotalesPeriodo = numeroDosisTotalesPeriodo;
    }

    public int getNumeroAplicacionesTotalesPeriodo() {
        return numeroAplicacionesTotalesPeriodo;
    }

    public void setNumeroAplicacionesTotalesPeriodo(int numeroAplicacionesTotalesPeriodo) {
        this.numeroAplicacionesTotalesPeriodo = numeroAplicacionesTotalesPeriodo;
    }

    public int getModalidadAplicacionTratamiento() {
        return modalidadAplicacionTratamiento;
    }

    public void setModalidadAplicacionTratamiento(int modalidadAplicacionTratamiento) {
        this.modalidadAplicacionTratamiento = modalidadAplicacionTratamiento;
    }

    public int getViaAdministracion() {
        return viaAdministracion;
    }

    public void setViaAdministracion(int viaAdministracion) {
        this.viaAdministracion = viaAdministracion;
    }

    public String getCum1() {
        return cum1;
    }

    public void setCum1(String cum1) {
        this.cum1 = cum1;
    }

    public String getCum2() {
        return cum2;
    }

    public void setCum2(String cum2) {
        this.cum2 = cum2;
    }

    public String getCum3() {
        return cum3;
    }

    public void setCum3(String cum3) {
        this.cum3 = cum3;
    }

    public String getCum4() {
        return cum4;
    }

    public void setCum4(String cum4) {
        this.cum4 = cum4;
    }

    public Long getCodigoHabilitacionEps() {
        return codigoHabilitacionEps;
    }

    public void setCodigoHabilitacionEps(Long codigoHabilitacionEps) {
        this.codigoHabilitacionEps = codigoHabilitacionEps;
    }

    public int getHermartrosis() {
        return hermartrosis;
    }

    public void setHermartrosis(int hermartrosis) {
        this.hermartrosis = hermartrosis;
    }

    public int getHemorragiaIlioPsoas() {
        return hemorragiaIlioPsoas;
    }

    public void setHemorragiaIlioPsoas(int hemorragiaIlioPsoas) {
        this.hemorragiaIlioPsoas = hemorragiaIlioPsoas;
    }

    public int getNumeroHermatrosisEspontaneasUltimoAño() {
        return numeroHermatrosisEspontaneasUltimoAño;
    }

    public void setNumeroHermatrosisEspontaneasUltimoAño(int numeroHermatrosisEspontaneasUltimoAño) {
        this.numeroHermatrosisEspontaneasUltimoAño = numeroHermatrosisEspontaneasUltimoAño;
    }

    public int getNumeroHermatrosisTraumaticasUltimoAño() {
        return numeroHermatrosisTraumaticasUltimoAño;
    }

    public void setNumeroHermatrosisTraumaticasUltimoAño(int numeroHermatrosisTraumaticasUltimoAño) {
        this.numeroHermatrosisTraumaticasUltimoAño = numeroHermatrosisTraumaticasUltimoAño;
    }

    public int getHemorragiaMuscular() {
        return hemorragiaMuscular;
    }

    public void setHemorragiaMuscular(int hemorragiaMuscular) {
        this.hemorragiaMuscular = hemorragiaMuscular;
    }

    public int getHemorragiaIntracraneal() {
        return hemorragiaIntracraneal;
    }

    public void setHemorragiaIntracraneal(int hemorragiaIntracraneal) {
        this.hemorragiaIntracraneal = hemorragiaIntracraneal;
    }

    public int getHemorragiaCuello() {
        return hemorragiaCuello;
    }

    public void setHemorragiaCuello(int hemorragiaCuello) {
        this.hemorragiaCuello = hemorragiaCuello;
    }

    public int getHemorragiaOral() {
        return hemorragiaOral;
    }

    public void setHemorragiaOral(int hemorragiaOral) {
        this.hemorragiaOral = hemorragiaOral;
    }

    public int getHemorragiaOtrasLocalizaciones() {
        return hemorragiaOtrasLocalizaciones;
    }

    public void setHemorragiaOtrasLocalizaciones(int hemorragiaOtrasLocalizaciones) {
        this.hemorragiaOtrasLocalizaciones = hemorragiaOtrasLocalizaciones;
    }

    public int getHemorragiaOtrasDiferentesHematrosisEspontaneas() {
        return hemorragiaOtrasDiferentesHematrosisEspontaneas;
    }

    public void setHemorragiaOtrasDiferentesHematrosisEspontaneas(int hemorragiaOtrasDiferentesHematrosisEspontaneas) {
        this.hemorragiaOtrasDiferentesHematrosisEspontaneas = hemorragiaOtrasDiferentesHematrosisEspontaneas;
    }

    public int getHemorragiaOtrasDiferentesHematrosisTraumaticas() {
        return hemorragiaOtrasDiferentesHematrosisTraumaticas;
    }

    public void setHemorragiaOtrasDiferentesHematrosisTraumaticas(int hemorragiaOtrasDiferentesHematrosisTraumaticas) {
        this.hemorragiaOtrasDiferentesHematrosisTraumaticas = hemorragiaOtrasDiferentesHematrosisTraumaticas;
    }

    public int getHemorragiaAsociadaProcesosDiferentesHematrosis() {
        return hemorragiaAsociadaProcesosDiferentesHematrosis;
    }

    public void setHemorragiaAsociadaProcesosDiferentesHematrosis(int hemorragiaAsociadaProcesosDiferentesHematrosis) {
        this.hemorragiaAsociadaProcesosDiferentesHematrosis = hemorragiaAsociadaProcesosDiferentesHematrosis;
    }

    public int getPresenciaInhibidorFechaCorte() {
        return presenciaInhibidorFechaCorte;
    }

    public void setPresenciaInhibidorFechaCorte(int presenciaInhibidorFechaCorte) {
        this.presenciaInhibidorFechaCorte = presenciaInhibidorFechaCorte;
    }

    public Date getFechaDeterminacionTitulosInhibidor() {
        return fechaDeterminacionTitulosInhibidor;
    }

    public void setFechaDeterminacionTitulosInhibidor(Date fechaDeterminacionTitulosInhibidor) {
        this.fechaDeterminacionTitulosInhibidor = fechaDeterminacionTitulosInhibidor;
    }

    public int getRecibidoItiUsuario() {
        return recibidoItiUsuario;
    }

    public void setRecibidoItiUsuario(int recibidoItiUsuario) {
        this.recibidoItiUsuario = recibidoItiUsuario;
    }

    public int getRecibioItiPeriodo() {
        return recibioItiPeriodo;
    }

    public void setRecibioItiPeriodo(int recibioItiPeriodo) {
        this.recibioItiPeriodo = recibioItiPeriodo;
    }

    public int getTiempoUsuarioIti() {
        return tiempoUsuarioIti;
    }

    public void setTiempoUsuarioIti(int tiempoUsuarioIti) {
        this.tiempoUsuarioIti = tiempoUsuarioIti;
    }

    public int getArtropatiaHemofilicaCronica() {
        return artropatiaHemofilicaCronica;
    }

    public void setArtropatiaHemofilicaCronica(int artropatiaHemofilicaCronica) {
        this.artropatiaHemofilicaCronica = artropatiaHemofilicaCronica;
    }

    public int getNumArticulacionesComprometidas() {
        return numArticulacionesComprometidas;
    }

    public void setNumArticulacionesComprometidas(int numArticulacionesComprometidas) {
        this.numArticulacionesComprometidas = numArticulacionesComprometidas;
    }

    public int getUsuarioInfectadoVhc() {
        return usuarioInfectadoVhc;
    }

    public void setUsuarioInfectadoVhc(int usuarioInfectadoVhc) {
        this.usuarioInfectadoVhc = usuarioInfectadoVhc;
    }

    public int getUsuarioInfectadoVhb() {
        return usuarioInfectadoVhb;
    }

    public void setUsuarioInfectadoVhb(int usuarioInfectadoVhb) {
        this.usuarioInfectadoVhb = usuarioInfectadoVhb;
    }

    public int getUsuarioInfectadoVih() {
        return usuarioInfectadoVih;
    }

    public void setUsuarioInfectadoVih(int usuarioInfectadoVih) {
        this.usuarioInfectadoVih = usuarioInfectadoVih;
    }

    public int getPseudotumores() {
        return pseudotumores;
    }

    public void setPseudotumores(int pseudotumores) {
        this.pseudotumores = pseudotumores;
    }

    public int getFracturas() {
        return fracturas;
    }

    public void setFracturas(int fracturas) {
        this.fracturas = fracturas;
    }

    public int getAnafilaxis() {
        return anafilaxis;
    }

    public void setAnafilaxis(int anafilaxis) {
        this.anafilaxis = anafilaxis;
    }

    public int getFactorAnacfiliactica() {
        return factorAnacfiliactica;
    }

    public void setFactorAnacfiliactica(int factorAnacfiliactica) {
        this.factorAnacfiliactica = factorAnacfiliactica;
    }

    public int getReemplazoArticularesVida() {
        return reemplazoArticularesVida;
    }

    public void setReemplazoArticularesVida(int reemplazoArticularesVida) {
        this.reemplazoArticularesVida = reemplazoArticularesVida;
    }

    public int getReemplazoArticularesPeriodo() {
        return reemplazoArticularesPeriodo;
    }

    public void setReemplazoArticularesPeriodo(int reemplazoArticularesPeriodo) {
        this.reemplazoArticularesPeriodo = reemplazoArticularesPeriodo;
    }

    public int getProfesionalAtencionUsuario() {
        return profesionalAtencionUsuario;
    }

    public void setProfesionalAtencionUsuario(int profesionalAtencionUsuario) {
        this.profesionalAtencionUsuario = profesionalAtencionUsuario;
    }

    public int getConsultasPresencialesHematologo() {
        return consultasPresencialesHematologo;
    }

    public void setConsultasPresencialesHematologo(int consultasPresencialesHematologo) {
        this.consultasPresencialesHematologo = consultasPresencialesHematologo;
    }

    public int getConsultasPresencialesOrtopedista() {
        return consultasPresencialesOrtopedista;
    }

    public void setConsultasPresencialesOrtopedista(int consultasPresencialesOrtopedista) {
        this.consultasPresencialesOrtopedista = consultasPresencialesOrtopedista;
    }

    public int getIntervencionProfesionalEnfermeria() {
        return intervencionProfesionalEnfermeria;
    }

    public void setIntervencionProfesionalEnfermeria(int intervencionProfesionalEnfermeria) {
        this.intervencionProfesionalEnfermeria = intervencionProfesionalEnfermeria;
    }

    public int getConsultasOdontologo() {
        return consultasOdontologo;
    }

    public void setConsultasOdontologo(int consultasOdontologo) {
        this.consultasOdontologo = consultasOdontologo;
    }

    public int getConsultaNutricionista() {
        return consultaNutricionista;
    }

    public void setConsultaNutricionista(int consultaNutricionista) {
        this.consultaNutricionista = consultaNutricionista;
    }

    public int getIntervencionTrabajoSocial() {
        return intervencionTrabajoSocial;
    }

    public void setIntervencionTrabajoSocial(int intervencionTrabajoSocial) {
        this.intervencionTrabajoSocial = intervencionTrabajoSocial;
    }

    public int getConsultaFisiatria() {
        return consultaFisiatria;
    }

    public void setConsultaFisiatria(int consultaFisiatria) {
        this.consultaFisiatria = consultaFisiatria;
    }

    public int getConsultaPsicologia() {
        return consultaPsicologia;
    }

    public void setConsultaPsicologia(int consultaPsicologia) {
        this.consultaPsicologia = consultaPsicologia;
    }

    public int getIntervencionQuimicoFarmaceutico() {
        return intervencionQuimicoFarmaceutico;
    }

    public void setIntervencionQuimicoFarmaceutico(int intervencionQuimicoFarmaceutico) {
        this.intervencionQuimicoFarmaceutico = intervencionQuimicoFarmaceutico;
    }

    public int getIntervencionFisioterapia() {
        return intervencionFisioterapia;
    }

    public void setIntervencionFisioterapia(int intervencionFisioterapia) {
        this.intervencionFisioterapia = intervencionFisioterapia;
    }

    public String getPrimerNombreMedicoPrincipal() {
        return primerNombreMedicoPrincipal;
    }

    public void setPrimerNombreMedicoPrincipal(String primerNombreMedicoPrincipal) {
        this.primerNombreMedicoPrincipal = primerNombreMedicoPrincipal;
    }

    public String getSegundoNombreMedicoPrincipal() {
        return segundoNombreMedicoPrincipal;
    }

    public void setSegundoNombreMedicoPrincipal(String segundoNombreMedicoPrincipal) {
        this.segundoNombreMedicoPrincipal = segundoNombreMedicoPrincipal;
    }

    public String getPrimerApellidoMedicoPrincipal() {
        return primerApellidoMedicoPrincipal;
    }

    public void setPrimerApellidoMedicoPrincipal(String primerApellidoMedicoPrincipal) {
        this.primerApellidoMedicoPrincipal = primerApellidoMedicoPrincipal;
    }

    public String getSegundoApellidoMedicoPrincipal() {
        return segundoApellidoMedicoPrincipal;
    }

    public void setSegundoApellidoMedicoPrincipal(String segundoApellidoMedicoPrincipal) {
        this.segundoApellidoMedicoPrincipal = segundoApellidoMedicoPrincipal;
    }

    public int getNumeroAtencionesServicioUrgenciasHemofilia() {
        return numeroAtencionesServicioUrgenciasHemofilia;
    }

    public void setNumeroAtencionesServicioUrgenciasHemofilia(int numeroAtencionesServicioUrgenciasHemofilia) {
        this.numeroAtencionesServicioUrgenciasHemofilia = numeroAtencionesServicioUrgenciasHemofilia;
    }

    public int getNumeroEventosHospitalariosHemofilia() {
        return numeroEventosHospitalariosHemofilia;
    }

    public void setNumeroEventosHospitalariosHemofilia(int numeroEventosHospitalariosHemofilia) {
        this.numeroEventosHospitalariosHemofilia = numeroEventosHospitalariosHemofilia;
    }

    public Double getCostoTotalUnidadesFactor() {
        return costoTotalUnidadesFactor;
    }

    public void setCostoTotalUnidadesFactor(Double costoTotalUnidadesFactor) {
        this.costoTotalUnidadesFactor = costoTotalUnidadesFactor;
    }

    public Double getCostosAgentePuente() {
        return costosAgentePuente;
    }

    public void setCostosAgentePuente(Double costosAgentePuente) {
        this.costosAgentePuente = costosAgentePuente;
    }

    public Double getCostosCoagulopatia() {
        return costosCoagulopatia;
    }

    public void setCostosCoagulopatia(Double costosCoagulopatia) {
        this.costosCoagulopatia = costosCoagulopatia;
    }

    public Double getCostosIncapacidadesCoagulopatia() {
        return costosIncapacidadesCoagulopatia;
    }

    public void setCostosIncapacidadesCoagulopatia(Double costosIncapacidadesCoagulopatia) {
        this.costosIncapacidadesCoagulopatia = costosIncapacidadesCoagulopatia;
    }

    public int getNovedades() {
        return novedades;
    }

    public void setNovedades(int novedades) {
        this.novedades = novedades;
    }

    public int getCausaMuerte() {
        return causaMuerte;
    }

    public void setCausaMuerte(int causaMuerte) {
        this.causaMuerte = causaMuerte;
    }

    public Date getFechaMuerte() {
        return fechaMuerte;
    }

    public void setFechaMuerte(Date fechaMuerte) {
        this.fechaMuerte = fechaMuerte;
    }

    public int getBdua() {
        return bdua;
    }

    public void setBdua(int bdua) {
        this.bdua = bdua;
    }

    public Date getFechaCorte() {
        return fechaCorte;
    }

    public void setFechaCorte(Date fechaCorte) {
        this.fechaCorte = fechaCorte;
    }
}
