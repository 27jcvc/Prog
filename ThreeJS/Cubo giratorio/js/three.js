import * as THREE from 'https://cdn.jsdelivr.net/npm/three@latest/build/three.module.js';

// Se crea una escena
const scene = new THREE.Scene();

// Se crea una camara
// (Distancia que se ve el objeto, 
// El tamaño que ocupa la camara, 
// A que distancia ve la camara, 
// distancia maxima que se vera )

const camera = new THREE.PerspectiveCamera(40, innerWidth / innerHeight, 0.1, 1000);

// diferentes tipos de renderizado para objetos 3D (el mas estandarizado WebGL en este caso)
const renderer = new THREE.WebGLRenderer();

    // Tamaño del renderizado
    renderer.setSize(window.innerWidth, window.innerHeight);
    // Añadimos el renderizado al dom
    document.body.appendChild(renderer.domElement);

    // creamos una geometria (suelen haber geometrias predefinidas como BoxGeometry() o esferas FVX o otro formato)
    // sin que sea predefinido se llaman primitivas
    const geometry = new THREE.BoxGeometry();

    const material = new THREE.MeshBasicMaterial( {color: 0x00ff00} );

    const cube = new THREE.Mesh(geometry, material);

    scene.add(cube);
    
    camera.position.z =5;

    /**
     * Esta funcion va refrescando fotograma por fotograma y renderizando la escena y la camara
     */
    function animate(){
        requestAnimationFrame ( animate);
        cube.rotation.x += 0.02
        cube.rotation.y += 0.02
        renderer.render(scene, camera);
    }

    animate();
