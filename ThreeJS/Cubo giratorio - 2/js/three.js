import * as THREE from 'https://cdn.jsdelivr.net/npm/three@latest/build/three.module.js';

// Se crea una escena
const scene = new THREE.Scene();
// color de fondo
// scene.background = new THREE.Color(0x66666);

// Se crea una camara
// (Distancia que se ve el objeto, 
// El tamaño que ocupa la camara, 
// A que distancia ve la camara, 
// distancia maxima que se vera )

const camera = new THREE.PerspectiveCamera(75, innerWidth / innerHeight, 0.1, 1000);


/**
 * Renderizacion
 * diferentes tipos de renderizado para objetos 3D (el mas estandarizado WebGL en este caso)
    Para hacer definir trasparencia hay que poner aplha: en el constructor del renderizado "WebGL"
    se pueden definir otras cosas como el antialiasing, etc...
 */
const renderer = new THREE.WebGLRenderer({alpha: true});

    // Tamaño del renderizado
    renderer.setSize(window.innerWidth, window.innerHeight);
    // Añadimos el renderizado al dom
    document.body.appendChild(renderer.domElement);

    // creamos una geometria (suelen haber geometrias predefinidas como BoxGeometry() o esferas FVX o otro formato)
    // sin que sea predefinido se llaman primitivas
    // Cubo
    const geometry = new THREE.BoxGeometry();
    const material = new THREE.MeshStandardMaterial( {color: 0x00ff00} );
        // los materiales basicos no generan sombras
    const cube = new THREE.Mesh(geometry, material);
    cube.castShadow = true;
        // este cubo genera sombras
    cube.position.set(1, -5, 2)
    scene.add(cube);
    
        /**
     * Se puede poner un punto de luz una luz unidireccional, etc.
     * Al generar una luz, hay que pensar en que va a recibir la luz 
     */
    // LIGHT
    const light = new THREE.DirectionalLight(0xfffffff, 1, 100);
    light.position.set(0, 1, 10);
        // esta luz genera sombras
    light.castShadow = true;
    scene.add(light)


    // PLANE - Plano
    const planeGeometry = new THREE.PlaneGeometry(20, 20, 32, 32);
    const planeMaterial = new THREE.MeshStandardMaterial({color: 0xff0000});
    const plane = new THREE.Mesh(planeGeometry, planeMaterial);
    plane.receiveShadow = true;
    plane.position.set(0, 0, 0);
    scene.add(plane);

    
    /**
     * Posicion de la camara
     */
    camera.position.z = 6;
    camera.position.y = -7;
    camera.rotation.x = 0.5;
    


    // const grid= new THREE.GridHelper(100,100);
    // scene.add(grid);


    /**
     * Esta funcion va refrescando fotograma por fotograma y renderizando la escena y la camara
     */
    function animate(){
        requestAnimationFrame ( animate );
        cube.rotation.x += 0.02
        cube.rotation.y += 0.02
        // camera.position.z += 0.01;
        // camera.rotation.y = 0.01;
        // camera.rotation.x = 0.01;

        light.position.set(0, 1, 1);

        renderer.render(scene, camera);
    }

    animate();
