package mes_web

class WS_SubsistemaController {
    static responseFormats = ['json', 'xml']
	
    def index() {
        respond WS_Subsistema.list()
    }
}
