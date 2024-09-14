package com.example.heroesapp.models

data class Heroe(
    val id: Int,
    val name: String,
    val description : String,
    val image: String,
    val publisherId : Int){
    companion object {
        val heroes = mutableListOf<Heroe>(

            // Marvel - 1
            Heroe(1, "Capitan América", "Un joven débil convertido en súper soldado gracias a un suero experimental. Armado con su escudo indestructible y un fuerte sentido del deber, es el símbolo del heroísmo y liderazgo de los Vengadores.", "https://cdn.pixabay.com/photo/2019/10/15/09/09/captain-american-4551118_1280.png",1),
            Heroe(2, "Iron Man (Tony Stark)", "Un genio multimillonario que, tras ser secuestrado, construye una armadura avanzada para escapar. A partir de ahí, usa su tecnología para proteger el mundo como Iron Man, líder de los Vengadores.", "https://easydrawingguides.com/wp-content/uploads/2017/05/how-to-draw-iron-mans-mask-featured-image-1200.png",1),
            Heroe(3, "Spider-Man (Peter Parker)", "Un joven que adquiere poderes arácnidos tras ser mordido por una araña radiactiva. Combina su agilidad, fuerza y un sentido arácnido para combatir el crimen mientras enfrenta los desafíos de ser un adolescente.", "https://cdn.pixabay.com/photo/2023/02/08/12/42/spider-man-7776510_1280.png",1),
            Heroe(4, "Thor", "El dios del trueno, originario de Asgard, lucha por proteger tanto a su reino como a la Tierra. Empuña el poderoso martillo Mjolnir, que le otorga el control del trueno y una fuerza inmensa.", "https://cdn.pixabay.com/photo/2022/03/15/07/29/tool-7069642_1280.png",1),
            Heroe(5, "Hulk", "Un científico que, tras un accidente con radiación gamma, se transforma en un ser gigantesco y de fuerza descomunal cada vez que se enfurece. Lucha por controlar su alter ego destructivo.", "https://upload.wikimedia.org/wikipedia/en/a/aa/Hulk_%28circa_2019%29.png",1),
            Heroe(6, "Black Widow (Natasha Romanoff)", "Una ex espía rusa altamente entrenada en combate y espionaje. Se une a los Vengadores, usando sus habilidades para luchar por el bien, a menudo en operaciones encubiertas.", "https://upload.wikimedia.org/wikipedia/en/1/1b/Black_Widow_1.png",1),
            Heroe(7, "Doctor Stange", "Un brillante pero arrogante cirujano cuya carrera termina tras un accidente. En su búsqueda de curación, se convierte en el Hechicero Supremo, protector de la Tierra contra amenazas místicas.", "https://www.pngall.com/wp-content/uploads/11/Doctor-Strange-PNG-Image-HD.png",1),
            Heroe(8, "Wolverine", "Un mutante con poderes de regeneración, sentidos agudizados y garras retráctiles de adamantium, un metal indestructible. Wolverine es conocido por su carácter salvaje y su longevidad, habiendo vivido y luchado en múltiples épocas y guerras. Es miembro de los X-Men, pero también trabaja solo en muchas ocasiones.", "https://upload.wikimedia.org/wikipedia/en/5/5d/Wolverine_%28James_%27Logan%27_Howlett%29.png",1),
            Heroe(9, "DareDevil", "Un abogado ciego que, tras un accidente con residuos radiactivos, desarrolla sentidos extraordinariamente agudos. Como Daredevil, protege las calles de Hell's Kitchen en Nueva York, usando sus habilidades acrobáticas y un agudo sentido del oído para luchar contra el crimen.", "https://toppng.com/uploads/preview/daredevil-marvel-comics-daredevil-11563000070zqj279vyx3.png",1),
            Heroe(10, "Black Panter","Rey de Wakanda, una nación tecnológicamente avanzada en África. Tras heredar el manto de Black Panther, usa su traje avanzado y habilidades sobrehumanas para proteger a su pueblo y el mundo.","https://seeklogo.com/images/B/black-panther-logo-F501CACF2C-seeklogo.com.png",1),

            // DC
            Heroe(11, "Superman", "Un alienígena del planeta Krypton con superpoderes que incluyen fuerza sobrehumana, vuelo y visión de rayos X. Es un símbolo de justicia y protector de la Tierra.", "https://cdn.pixabay.com/photo/2024/03/26/04/33/ai-generated-8655895_1280.png", 2),
            Heroe(12, "Batman (Bruce Wayne)", "Un millonario que lucha contra el crimen en Gotham usando su intelecto, habilidades de combate y tecnología avanzada, motivado por la muerte de sus padres.", "https://1000logos.net/wp-content/uploads/2021/10/Batman-Logo.png", 2),
            Heroe(13, "Wonder Woman (Diana Prince)", "Una guerrera amazona inmortal con habilidades sobrehumanas y un lazo de la verdad. Es un símbolo de fuerza y compasión.", "https://danielhsepulveda.com/wp-content/uploads/2024/01/wonder-woman-mujer-maravilla-comics-y-novelas-graficas-2.png", 2),
            Heroe(14, "Flash (Barry Allen)", "Un científico que adquiere velocidad sobrehumana tras un accidente con rayos. Es conocido como el hombre más rápido del mundo.", "https://upload.wikimedia.org/wikipedia/en/b/b7/Flash_%28Barry_Allen%29.png", 2),
            Heroe(15, "Aquaman (Arthur Curry)", "Rey de Atlantis, con la capacidad de respirar bajo el agua, comunicarse con la vida marina y una fuerza sobrehumana.", "https://upload.wikimedia.org/wikipedia/en/9/9d/Aquaman_Rebirth_1.png", 2),
            Heroe(16, "Green Lantern (Hal Jordan)", "Un piloto de pruebas que recibe un anillo de poder de un extraterrestre moribundo, otorgándole la habilidad de crear construcciones de energía pura.", "https://upload.wikimedia.org/wikipedia/en/9/90/Green_Lantern_%28Hal_Jordan%29.png", 2),
            Heroe(17, "Cyborg (Victor Stone)", "Un ex-atleta que tras un accidente queda fusionado con tecnología avanzada, convirtiéndose en un héroe cibernético con una increíble variedad de poderes tecnológicos.", "https://upload.wikimedia.org/wikipedia/en/7/7f/Cyborg_%28Victor_Stone_-_circa_1980s%29.png", 2),
            Heroe(18, "Shazam (Billy Batson)", "Un niño que se convierte en un superhéroe adulto al gritar 'Shazam'. Tiene la sabiduría de Salomón, la fuerza de Hércules y otros poderes místicos.", "https://upload.wikimedia.org/wikipedia/en/8/82/Shazam_Captain_Marvel.png", 2),
            Heroe(19, "Green Arrow (Oliver Queen)", "Un arquero experto y millonario que lucha contra el crimen usando sus habilidades en tiro con arco y tecnología avanzada.", "https://static.wikia.nocookie.net/all-worlds-alliance/images/9/96/E408bacd4e65e8973a7b7b76f904004d.png/revision/latest?cb=20190110152329.png", 2),
            Heroe(20, "Martian Manhunter (J'onn J'onzz)", "Un extraterrestre con habilidades como cambio de forma, telepatía y fuerza sobrehumana, miembro de la Liga de la Justicia.", "https://upload.wikimedia.org/wikipedia/en/3/34/Martian_Manhunter_Alex_Ross.png", 2)

        )
    }
}
