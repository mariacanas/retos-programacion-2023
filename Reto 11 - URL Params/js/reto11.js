
const URL = "https://retosdeprogramacion.com?year=2023&challenge=0";



function mostrarData(urlData){

    if(!urlData.includes("?")) console.log("No existen parametros en la url proporcionada");
    else{
        let urlConsulta = urlData.split("?");
        let urlParams = urlConsulta[1];

        urlParams = urlParams.split("&");

        let paramsObject = [];

        for(let i = 0; i < urlParams.length; i++){
            let p = urlParams[i].split("=");
            let valor = p[1];
            paramsObject.push(valor);
        }
        console.log(paramsObject);
    }
}


mostrarData(URL);