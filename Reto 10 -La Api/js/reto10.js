

const APIURL = "https://pokeapi.co/api/v2/pokemon/";

async function mostrarInformacionPokemon(pokemon){

    fetch(APIURL + pokemon)
        .then(response => response.json())
        .then(dataPokemon => {
            const heldItemsName = dataPokemon.held_items.map(item => item.item.name)
            console.log({Nombre: dataPokemon.name, Id: dataPokemon.id, Held: heldItemsName});
        });
}

mostrarInformacionPokemon("pikachu");
mostrarInformacionPokemon(1);